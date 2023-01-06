package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("Pro")
public class ProController {
	
	
	
	@Autowired
	ProService serv;

	@GetMapping("/getAllStudents")
    public ResponseEntity<List<String>> getAllStudents(){
        List<String> students = serv.getStudent() ; 

        return new ResponseEntity<>(students, HttpStatus.CREATED);
    }
  
  
  @PostMapping("/addStudent")
  public ResponseEntity<String> addStudent(@RequestBody Student student){
                 serv.addMyStudent(student);
      return new ResponseEntity<>("New student added successfully", HttpStatus.CREATED);
  }

  	
}
