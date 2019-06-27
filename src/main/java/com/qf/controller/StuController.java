package com.qf.controller;

import com.qf.service.StuService;
import com.qf.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class StuController {
    @Autowired
    StuService stuService;
    @RequestMapping("insert")
    public Object insert(){
        Student student = new Student(null,"zs","98",new Date(),1);
        stuService.insert(student);
        return "succ";
    }
}
