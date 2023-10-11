package com.oasys.students.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.students.entity.Students;
import com.oasys.students.exception.AgeNotFoundException;
import com.oasys.students.repository.StudentsRepository;
@Repository
public class StudentsDao {
	@Autowired
StudentsRepository stuRepo;
	public String getByStudentsrecords(Students s){
		stuRepo.save(s);
		return "Successfully Inserted";
	}
	public Students getbyid(int id) {
		
	return  stuRepo.findById(id).get();
	}
	public String putofUpdate(Students s) {
		stuRepo.save(s);
		return "Updated";
	}
	public String deleteBYid(int id) {
		stuRepo.deleteById(id);
		return "id deleted";
	}

}
