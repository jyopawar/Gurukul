package com.education.Gurukul.controller;


import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.education.Gurukul.model.Student;
import com.education.Gurukul.service.Studentservice;




@Controller
public class Studentcontroller {
	
	@RequestMapping(value="/registration")
	public String register(){
			System.out.println("hi");
			return "studreg";
	}
		@Autowired
	Studentservice studentservice;
		
		@PostMapping("/student")
		public @ResponseBody Student addStudent(@RequestBody Student student) {
			return studentservice.saveStudent(student);

		}
		@GetMapping("/user/{id}")
		public @ResponseBody Student getStudent(@PathVariable("id")Long id) {
		
			return studentservice.getStudent(id);

}
		@DeleteMapping("/delete/{id}")
		public @ResponseBody ResponseEntity<Map<String, Boolean>> deleteStudent(@PathVariable("id")Long id) throws AttributeNotFoundException {
		
			return studentservice.deleteStudent(id);

}

}

