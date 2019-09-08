package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface ServiceI {
	
	public void addStudent(Student s);
	
	public List<Student> displayAllStudent(String username,String password);

	public void delete(int rollno);

	public Student edit(int rollno);

	public void update(Student s);

	

}
