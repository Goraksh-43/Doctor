package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.service.ServiceI;

@RestController
@CrossOrigin("*")
public class HomeController {

	@Autowired
	private ServiceI sr;

	@PostMapping("/adds")
	public String addStudent(@RequestBody Student s) {
		System.out.println("Hey Hello world..............!!");
		System.out.println("open add student called----");
		sr.addStudent(s);
		return "Data Added Successfully";
	}

	@GetMapping("/log/{username}/{password}")
	public List<Student> displayAllStudent(@PathVariable String username, @PathVariable String password) {
		System.out.println("open display all called----");
		List<Student> slist = sr.displayAllStudent(username, password);
		return slist;
	}

	@DeleteMapping("/del/{rollno}")
	public String delete(@PathVariable int rollno) {
		System.out.println("open delete called----");
		sr.delete(rollno);
		return "Data Deleted successfully";
	}

	@GetMapping("/edit/{rollno}")
	public Student edit(@PathVariable int rollno) {
		System.out.println("open edit called---");
		Student s = sr.edit(rollno);

		return s;
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Student s)
	{
		System.out.println("open update called---");
		sr.update(s);
		return "Data updated successfully";
	}
	
}
