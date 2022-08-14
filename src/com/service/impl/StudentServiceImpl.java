package com.service.impl;

import com.dao.StudentDao;
import com.domain.student;
import com.service.StudentService;
import com.util.SqlSessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);
    @Override
    public student getByid(String id) {
        student s = studentDao.getById(id);
        return s;
    }

    @Override
    public void save(student s) {
        studentDao.save(s);
    }

    @Override
    public List<student> getAll() {
        List<student> slist = studentDao.getAll();
        return slist;
    }
}
