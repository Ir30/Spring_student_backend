package com.example.SpringStudentApp_new.controller;


import com.example.SpringStudentApp_new.Dao.StudentDao;
import com.example.SpringStudentApp_new.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class Student_controller {

    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public HashMap<String ,String> addStudent(@RequestBody StudentModel s){

        dao.save(s);
        HashMap<String,String> res =new HashMap<>();
        res.put("status","succes");
        return res;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<StudentModel> viewStudents(){
        return (List<StudentModel>)dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<StudentModel> searchStudent(@RequestBody StudentModel s){

        return (List<StudentModel>) dao.searchStudent(s.getAdm().toString());
    }


    @CrossOrigin(origins = "*")
    @PostMapping("/delete")
    public HashMap<String,String> deleteStudent(@RequestBody StudentModel s){

        dao.deleteStudent(s.getId());
        HashMap<String,String> res=new HashMap<>();
        res.put("status","success");
        return res;
    }


}
