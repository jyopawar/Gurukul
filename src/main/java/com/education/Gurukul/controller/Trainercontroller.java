package com.education.Gurukul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.Gurukul.model.Trainer;
import com.education.Gurukul.service.Trainerservice;
@Controller
//@RestController
public class Trainercontroller {
	
	@RequestMapping(value="/trainer")
	public String Enroll(){
			System.out.println("hi");
			return "trainerreg";
	}


	 
	@Autowired
	Trainerservice trainerservice;
	
	@PostMapping("/trainer")
	public Trainer addTrainer(@RequestBody Trainer trainer) {
		return trainerservice.saveTrainer(trainer);
		
	}

}
