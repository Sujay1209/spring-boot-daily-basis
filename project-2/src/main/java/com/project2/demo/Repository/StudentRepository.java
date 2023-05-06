package com.project2.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project2.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	

}
