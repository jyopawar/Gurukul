package com.education.Gurukul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.Gurukul.model.Trainer;
import com.education.Gurukul.repository.Trainerrepository;

@Service
public class Trainerservice {
	
	   @Autowired
	   Trainerrepository trainerrepository;
	   
	public Trainer saveTrainer(Trainer trainer) {
		return trainerrepository.save(trainer);
	}
}
