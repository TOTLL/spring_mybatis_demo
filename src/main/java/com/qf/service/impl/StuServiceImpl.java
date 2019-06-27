package com.qf.service.impl;

import com.qf.dao.StuDao;
import com.qf.entity.Student;
import com.qf.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StuServiceImpl  implements StuService {
    @Autowired
    private  StuDao stuDao;
    @Override
    @Transactional
    public void insert(Student student) {
        stuDao.insert(student);
        //事务回滚
        System.out.println(1/0);
    }
}
