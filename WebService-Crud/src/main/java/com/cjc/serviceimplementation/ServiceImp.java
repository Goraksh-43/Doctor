package com.cjc.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.Dao;
import com.cjc.model.Student;
import com.cjc.service.ServiceI;

@Service
public class ServiceImp implements ServiceI{
	
	@Autowired
	private Dao d;

	@Override
	public void addStudent(Student s) {
		d.save(s);
	}

	@Override
	public List<Student> displayAllStudent(String username, String password) {
		List<Student> slist=d.findAll();
		return slist;
	}

	@Override
	public void delete(int rollno) {
		d.deleteById(rollno);
		
	}

	@Override
	public Student edit(int rollno) {
		Student s=d.findById(rollno).get();
		return s;
	}

	@Override
	public void update(Student s) {
		d.save(s);
		
	}
	
	

}
