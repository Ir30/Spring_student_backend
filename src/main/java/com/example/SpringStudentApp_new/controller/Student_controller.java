package com.example.SpringStudentApp_new.controller;


import com.example.SpringStudentApp_new.Dao.StudentDao;
import com.example.SpringStudentApp_new.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

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

}
