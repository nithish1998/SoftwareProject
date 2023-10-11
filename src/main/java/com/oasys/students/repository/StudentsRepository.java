package com.oasys.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oasys.students.entity.Students;

public interface StudentsRepository extends JpaRepository<Students, Integer>{

}
