package com.student.main.services;

import java.util.Optional;

import com.student.main.entities.Student;

public interface StudentMasterInterface {
	Student addStudent(Student student);
	Iterable<Student> getallDetails();
	Optional<Student> getDetailsById(int sid);
	String deleteById(int sid);
	Student update(Student student);
	String updateById(int sid,Student student);
}
