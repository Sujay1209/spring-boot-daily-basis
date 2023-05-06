package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.student;
import com.example.demo.repository.StudentRepository;


@Service
public class StudentService {
	@Autowired
	StudentRepository studRepository;
	
	public List<student> getAllStudents()
	{
		List<student>studList=studRepository.findAll();
		return studList;
	}
	public Student saveStudent(Student s)
	{
		return studRepository.save(s);
	}

}
