package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entiey.Student;
import com.mapper.StudentMapper;
import com.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentMapper mapper;
	@Override
	public List<Student> selectAll() {
		System.out.println("StudentService");
		// TODO Auto-generated method stub
		List<Student> list=mapper.selectAll();
		return list;
	}
	@Override
	public Student selectById(Integer id) {
		Student s=mapper.selectById(id);
		return s;
	}
	@Override
	public void insert(Student s) {
		// TODO Auto-generated method stub
		mapper.insert(s);
		
	}

}
