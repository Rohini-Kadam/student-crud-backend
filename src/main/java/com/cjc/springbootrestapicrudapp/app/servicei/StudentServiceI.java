package com.cjc.springbootrestapicrudapp.app.servicei;

import java.util.List;

import com.cjc.springbootrestapicrudapp.app.model.Student;

public interface StudentServiceI {

public List<Student> getStudents();

public Student saveStudent(Student s);

public void deleteStudent(int rollno);

public Student updateStudent(int rollno, Student s);

}
