package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
    private StudentMapper studentmapper;
	@Override
	public List<Student> selectall() {
		// TODO Auto-generated method stub
		return studentmapper.selectall();
	}
	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return studentmapper.delete(id);
	}
	@Override
	public int update(Student s) {
		// TODO Auto-generated method stub
		return studentmapper.update(s);
	}
	@Override
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		return studentmapper.findById(id);
	}
	@Override
	public int add(Student s) {
		// TODO Auto-generated method stub
		return studentmapper.add(s);
	}

}
