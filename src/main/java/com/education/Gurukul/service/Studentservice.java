package com.education.Gurukul.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.education.Gurukul.model.Student;
import com.education.Gurukul.repository.Studentrepository;

@Service
public class Studentservice {
	
	@Autowired
	Studentrepository studentrepository;
	
	public Student saveStudent(Student student) {
		return studentrepository.save(student);
	}
	public Student getStudent(Long id) {
		return studentrepository.findById(id).orElse(null);
	}
	public ResponseEntity<Map<String,Boolean>>deleteStudent(Long id) throws AttributeNotFoundException {
		Student student=studentrepository.findById(id).orElseThrow(() -> new AttributeNotFoundException("student not exist:"+id));
		studentrepository.delete(student);
		Map<String,Boolean> response=new HashMap();
		response.put("deleted",Boolean.TRUE);
		return ResponseEntity.ok(response);
		    }
		
	}

	

	


	


