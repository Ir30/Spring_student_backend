package com.example.SpringStudentApp_new.Dao;

import com.example.SpringStudentApp_new.Model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {
}
