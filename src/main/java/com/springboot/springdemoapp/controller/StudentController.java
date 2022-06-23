package com.springboot.springdemoapp.controller;

import com.springboot.springdemoapp.Models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/studentslist")
    public Student[] studentList(){
        Student[] students = new Student[5];
        students[0]=new Student("Sathiya","Murthy");
        students[1]=new Student("Sakthi","vel");
        students[2]=new Student("Tamil","Arasn");
        students[3]=new Student("Sherma","raja");
        students[4]=new Student("Karthi","Keyan");


        return students;
    }

}
