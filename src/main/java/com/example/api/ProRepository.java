package com.example.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




import org.springframework.stereotype.Repository;

@Repository
public class ProRepository {

	
Map<String,Student > map ;

public ProRepository() {
	super();
	// TODO Auto-generated constructor stub
	
	
	map = new HashMap<>();
	
}


public List<String> getAllStudent()
{

	List<String> list = new ArrayList();
	
	for(String name : map.keySet())
	{
		list.add(name);
	}
	
	
	return list;
	
}


public void addStudent(Student student)
{
  	map.put(student.getName(),student);
  	
}


	
	
}
