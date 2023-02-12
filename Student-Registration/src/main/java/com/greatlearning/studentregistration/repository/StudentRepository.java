package com.greatlearning.studentregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.studentregistration.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
