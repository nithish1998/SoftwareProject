package com.oasys.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.oasys.students.entity.Students;
import com.oasys.students.exception.AgeNotFoundException;
import com.oasys.students.service.StudentsService;

@RestController

public class StudentsController {
	@Autowired
	StudentsService stuSer;
	
	@PostMapping(value="/getrecords")
	public String getByStudentsrecords(@RequestBody Students s)throws AgeNotFoundException {
		return stuSer.getByStudentsrecords(s);
	}
	@GetMapping(value="/getid/{id}")
	public Students getbyid(@PathVariable int id) {
		return stuSer.getbyid(id);
	}
	@PutMapping(value="/update")
	public String putofUpdate(@RequestBody Students s) {
		return stuSer.putofUpdate(s);
		
	}
	@DeleteMapping(value="/delete/{id}")
	public String deleteByid(@PathVariable int id) {
		return stuSer.deleteByid(id);
	}
	

}
