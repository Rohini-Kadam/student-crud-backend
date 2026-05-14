package com.cjc.springbootrestapicrudapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.springbootrestapicrudapp.app.model.Student;
import com.cjc.springbootrestapicrudapp.app.servicei.StudentServiceI;

@RestController
public class StudentController {
@Autowired
StudentServiceI ssi;
//GET - http://localhost:9090/students
@GetMapping("/students")
public List<Student> getStudents()
{ 
	List<Student> list = ssi.getStudents();
	return list;
}
//Post - http://localhost:9090/student
@PostMapping("/student")
public Student saveStudent(@RequestBody Student s)
{ 
	Student stu= ssi.saveStudent(s);
	return stu;
}
//Delete- http://localhost:9090/student/rollno
@DeleteMapping("/student/{rollno}")
public void deleteStudent(@PathVariable("rollno")int rollno)
{
	System.out.println("Roll no: "+rollno);
	ssi.deleteStudent(rollno);
}
//Put- http://localhost:9090/student/rollno
@PutMapping("/student/{rollno}")
public Student updateStudent(@PathVariable("rollno")int rollno,@RequestBody Student s)
{
	Student student = ssi.updateStudent(rollno,s);
	if(student!=null)
	{
		return student;
	}else
	{
		System.out.println("No record found.");
		return null;
	}
}
}
