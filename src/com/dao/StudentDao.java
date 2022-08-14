package com.dao;

import com.domain.student;

import java.util.List;

public interface StudentDao {
    public student  getById(String id);
    public void save(student s);

    List<student> getAll();
}
