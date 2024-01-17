package com.student.main.services;

//import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.main.dao.StudentRepo;
import com.student.main.entities.Student;
@Component
public class StudentService implements StudentMasterInterface {
	@Autowired
	StudentRepo sRepo;
	
    
	public Student addStudent(Student student) {
		sRepo.save(student);
		return student;
	}
	public Iterable<Student> getallDetails(){
		 return sRepo.findAll();
	}
	
	public  Optional<Student> getDetailsById(int sid) {
		
//		Optional<Student>getOptional=sRepo.findById(sid);
//		if(getOptional.isPresent()) {
//			return sRepo.findById(sid);
//		}
//		else
//		{
//			return Optional.empty();
//		}
		 return sRepo.findById(sid);
	}
	
	public String deleteById(int sid) {
		
		Optional<Student>getdeleob=sRepo.findById(sid);
		if(getdeleob.isPresent()) {
			sRepo.deleteById(sid);
		      return "Deleted";
		}
		else
		{
			return "No Suitable id Present";
		}
	}
	
	public Student update(Student student) {
		return sRepo.save(student);
		
	}
	public String updateById(int sid,Student student) {
		Optional<Student>upid=sRepo.findById(sid);
		if(upid.isPresent()) {
			student.setSid(sid);
			sRepo.save(student);
			return "Updated";
		}
		else {
			return "Invalid Id";
		}
	}
}
