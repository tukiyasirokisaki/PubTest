package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Student;
@Mapper
public interface StudentMapper {
	 List<Student> selectall();
	 int delete(Integer id) ;

	 int update(Student s);

	 Student findById(Integer id);

	 int add(Student s) ;
}
