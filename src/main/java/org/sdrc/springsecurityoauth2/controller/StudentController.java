package org.sdrc.springsecurityoauth2.controller;

import org.sdrc.springsecurityoauth2.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
public class StudentController {

	@GetMapping("getOneStudent")
	public Student getOneStudent(){
		Student student = new Student();
		
		student.setRollNo("1");
		student.setName("Ratikanta");
		student.setAge(20);
		
		return student;
	}
}
