package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ProService {
	
	
	@Autowired
	ProRepository repo;
	
	
	public List<String> getStudent()
	{
		return repo.getAllStudent();
		
		
	}
	
	
	public void addMyStudent(Student student )
	{
	 repo.addStudent(student);
		
		
	}

}
