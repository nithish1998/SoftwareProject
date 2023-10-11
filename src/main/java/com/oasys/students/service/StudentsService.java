package com.oasys.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.students.dao.StudentsDao;
import com.oasys.students.entity.Students;
import com.oasys.students.exception.AgeNotFoundException;
@Service
public class StudentsService {
	@Autowired
StudentsDao stuDao;
	public String getByStudentsrecords(Students s)throws AgeNotFoundException {
		
		if(s.getAge()>18) {
			return stuDao.getByStudentsrecords(s);
			
		}
		else {
			throw new AgeNotFoundException("The is age is below 18 to join college ");
		}
	}
	public Students getbyid(int id) {
	    
		return stuDao.getbyid(id);
	}
	public String putofUpdate(Students s) {
		
		return stuDao.putofUpdate(s);
	}
	public String deleteByid(int id) {
		
		return stuDao.deleteBYid(id);
	}

}
