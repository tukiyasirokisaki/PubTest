package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Student;
import com.example.demo.service.StudentService;

@Controller
public class TestController {
	@Autowired
	private StudentService ss;
	
	@RequestMapping(value="/index1")
	public String index(Model model) {
		List<Student> list = ss.selectall();
	    model.addAttribute("student", list);
	    return "index1";
	}

	//添加的跳转
	@RequestMapping(value = "/addIndex")
	public String addIndex(){
	    return "add";
	}
	
	//添加
	@RequestMapping(value = "/add")
	public String add(Student S){
			ss.add(S);
	        return "redirect:index1";
	}
	
	//跳到修改页面
	@RequestMapping(value = "/toUpdate")
	public String toUpdate(Integer id, Model model){
		Student student=ss.findById(id);
	    model.addAttribute("student",student);
	    return "update";
	}
	
	//修改
	@RequestMapping(value = "/update")
	public String update(Student S){
	    ss.update(S);
	    return "redirect:index1";
	}
	
	//删除
	@RequestMapping(value = "/delete")
	public String delete(Integer id){
		ss.delete(id);
	    return "redirect:index1";
	}

}
