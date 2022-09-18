package com.education.Gurukul.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.education.Gurukul.model.Trainer;

@Repository
public interface Trainerrepository extends CrudRepository<Trainer,Long> {

}
