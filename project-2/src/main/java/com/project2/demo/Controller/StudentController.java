package com.project2.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.demo.Service.StudentService;
import com.project2.demo.model.Student;

@RestController
public class StudentController {
	@Autowired
	StudentService ss;
@GetMapping("/id")
	public List<Student>setall()
	{
		return ss.getall();
	}
@PostMapping("/save")
    public Student saveid(@RequestBody Student s)
    {
    	return ss.saveall(s);
    }
@PutMapping("/update")
    public Student update(@RequestBody Student u)
    {
	    return ss.update(u);
    }
@DeleteMapping("/delete/{id}")
public String delete(@PathVariable int id)
{
	ss.deleteall(id);
	return "deleted";
	
}
@GetMapping("/id/{id}")
public Optional<Student> get(@PathVariable int id)
{
	return ss.findall(id);
}



}
