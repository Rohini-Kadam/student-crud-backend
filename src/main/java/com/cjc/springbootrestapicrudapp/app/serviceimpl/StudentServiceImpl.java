package com.cjc.springbootrestapicrudapp.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.springbootrestapicrudapp.app.model.Student;
import com.cjc.springbootrestapicrudapp.app.repository.StudentRepository;
import com.cjc.springbootrestapicrudapp.app.servicei.StudentServiceI;
@Service
public class StudentServiceImpl implements StudentServiceI {
	@Autowired
	StudentRepository sr;

	@Override
	public List<Student> getStudents() {
	
		return sr.findAll();
	}

	@Override
	public Student saveStudent(Student s) {
		
		return sr.save(s);
	}

	@Override
	public void deleteStudent(int rollno) {
		
		sr.deleteById(rollno);
	}

	@Override
	public Student updateStudent(int rollno, Student s) {
		Optional<Student> opt = sr.findById(rollno);
		if(opt.isPresent())
		{
			Student stu = opt.get();
			stu.setName(s.getName());
			return sr.save(stu);
		}else
		{
		return null;
		}
	}

}
