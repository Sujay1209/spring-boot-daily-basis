package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DemoModel;

public interface DemoRepository extends JpaRepository<DemoModel,Integer> {
	
	public List<DemoModel>findByNameStartingWith(String prefix);
	public List<DemoModel>findByNameEndingWith(String suffix);
	public List<DemoModel>findByEmail(String email);

}
