package com.lhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lhy.bean.Student;
import com.lhy.bean.Teacher;
import com.lhy.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("findAll")
	public String findAll(Model model){
		List<Student> slist = studentService.findAll();
		model.addAttribute("slist",slist);
		System.out.println(slist);
		return "list";
	}
	
	@RequestMapping("toadd")
	public String toadd(Model model) {
		List<Teacher> tlist = studentService.teacherList();
		model.addAttribute("tlist",tlist);
		return "insert";
	}
	
	@RequestMapping("add")
	public String insert(Model model,Student student) {
		studentService.insert(student);
		return "redirect:findAll";
	}
	
	@RequestMapping("del")
	public String del(Integer sid){
		studentService.del(sid);
		return "redirect:findAll";
	}
	
	@RequestMapping("toupdate")
	public String toupdate(String sid,Model model){
		Student student = studentService.toupdate(sid);
		model.addAttribute("student",student);
		List<Teacher> tlist = studentService.teacherList();
		model.addAttribute("tlist",tlist);
		return "update";
		
	}
	
	@RequestMapping("update")
	public String update(Student student){
		studentService.update(student);
		return "redirect:findAll";
	}
}
