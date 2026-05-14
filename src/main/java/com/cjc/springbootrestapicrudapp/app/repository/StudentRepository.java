package com.cjc.springbootrestapicrudapp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.springbootrestapicrudapp.app.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
