package com.project2.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.demo.Repository.StudentRepository;
import com.project2.demo.model.Student;

@Service
public class StudentService {
	@Autowired
	StudentRepository se;
	
	public List<Student> getall()
	{
		return se.findAll();
	}
	public Student saveall(Student s)
	{
		return se.save(s);
	}
	public Student update(Student u)
	{
		return se.save(u);
	}
	public void deleteall(int id)
	{
		 se.deleteById(id);
	}
	public Optional<Student> findall(int id)
	{
		return se.findById(id);
		
	}

}
