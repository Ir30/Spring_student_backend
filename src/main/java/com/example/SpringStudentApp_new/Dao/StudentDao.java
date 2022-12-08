package com.example.SpringStudentApp_new.Dao;

import com.example.SpringStudentApp_new.Model.StudentModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {

    @Query(value = "SELECT `id`, `adm`, `age`, `college`, `name`, `place`, `roll_no` FROM `student` WHERE `adm` = :adm",nativeQuery = true)
    List<StudentModel> searchStudent(@Param("adm")String adm);
}
