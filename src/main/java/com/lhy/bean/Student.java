package com.lhy.bean;

public class Student {
	
	private Integer sid;
	private String sname;
	private Integer sage;
	private String birthday;
	private Teacher teacher;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer sid, String sname, Integer sage, String birthday, Teacher teacher) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.birthday = birthday;
		this.teacher = teacher;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", birthday=" + birthday + ", teacher="
				+ teacher + "]";
	}
	
	
}
