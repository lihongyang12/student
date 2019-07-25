package com.lhy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhy.bean.Student;
import com.lhy.bean.Teacher;
import com.lhy.mapper.StudentMapper;
import com.lhy.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService  {
	
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<Student> findAll() {
		List<Student> findAll = studentMapper.findAll();
		return  findAll;
	}

	@Override
	public List<Teacher> teacherList() {
		
		return studentMapper.teacherList();
	}

	@Override
	public void insert(Student student) {
		studentMapper.insert(student);
	}

	@Override
	public void del(Integer sid) {
		studentMapper.del(sid);
	}

	@Override
	public Student toupdate(String sid) {
		Student student = studentMapper.toupdate(sid);
		return student;
	}

	@Override
	public void update(Student student) {
		studentMapper.update(student);
	}
}
