package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studService;
	
	@GetMapping(value="/fetchStudents")
	public List<Student>studList=studService.getAllStudents();
	return studList;
}
