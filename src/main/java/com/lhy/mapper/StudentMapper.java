package com.lhy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lhy.bean.Student;
import com.lhy.bean.Teacher;
@Mapper
public interface StudentMapper {
	
	List<Student> findAll();

	List<Teacher> teacherList();

	void insert(Student student);

	void del(Integer sid);

	Student toupdate(String sid);

	void update(Student student);


}
