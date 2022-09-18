package com.education.Gurukul.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.education.Gurukul.model.Student;


@Repository

public interface Studentrepository extends CrudRepository<Student,Long>{

}


