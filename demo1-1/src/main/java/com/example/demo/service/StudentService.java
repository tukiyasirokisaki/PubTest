package com.example.demo.service;

import java.util.List;
import com.example.demo.domain.Student;
public interface StudentService {
	List<Student> selectall();

	int delete(Integer id) ;

	int update(Student s);

	Student findById(Integer id);

	int add(Student s) ;
	
}
