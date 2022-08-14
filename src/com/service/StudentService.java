package com.service;

import com.domain.student;

import java.util.List;

public interface StudentService {
    public student getByid(String id);
    public void save (student s);

    List<student> getAll();
}
