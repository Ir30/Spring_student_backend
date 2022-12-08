package com.example.SpringStudentApp_new.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Table(name = "Student")
public class StudentModel {

    @Id
    @GeneratedValue
    private int id;
    private String adm;
    private int roll_nO;
    private String name;
    private String place;
    private String college;
    private int age;

    public StudentModel() {
    }

    public StudentModel(int id, String adm, int roll_nO, String name, String place, String college, int age) {
        this.id = id;
        this.adm = adm;
        this.roll_nO = roll_nO;
        this.name = name;
        this.place = place;
        this.college = college;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getAdm() {
        return adm;
    }

    public int getRoll_nO() {
        return roll_nO;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public String getCollege() {
        return college;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAdm(String adm) {
        this.adm = adm;
    }

    public void setRoll_nO(int roll_nO) {
        this.roll_nO = roll_nO;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
