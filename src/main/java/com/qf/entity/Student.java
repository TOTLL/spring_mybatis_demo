package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
public class Student implements Serializable {
    Integer id;
    String name;
    String score;
    Date birthday;
    int cid;

    public Student(Integer id, String name, String score, Date birthday, int cid) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.birthday = birthday;
        this.cid = cid;
    }
}
