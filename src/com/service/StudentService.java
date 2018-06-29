package com.service;

import java.util.List;

import com.entiey.Student;

public interface StudentService {
  public List<Student> selectAll();

  public Student selectById(Integer id);

  public void insert(Student s);
}
