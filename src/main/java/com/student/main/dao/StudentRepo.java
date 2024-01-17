package com.student.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.main.entities.Student;
@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
