package com.lhy.service;

import java.util.List;

import com.lhy.bean.Student;
import com.lhy.bean.Teacher;

public interface StudentService {

	List<Student> findAll();

	List<Teacher> teacherList();

	void insert(Student student);

	void del(Integer sid);

	Student toupdate(String sid);

	void update(Student student);

}
