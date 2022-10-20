package com.feign.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feign.demo.client.StudentCallFeignInterface;
import com.feign.demo.model.Student;

@Service
public class StudentFeignCallServiceImpl implements StudentFeignCallService{

	@Autowired
	StudentCallFeignInterface studentCallFeignInterface;
	
	@Override
	public Student getStudent() {
		return studentCallFeignInterface.getStudent();
	}

	@Override
	public Student postStudent(Student student) {
		return studentCallFeignInterface.postStudent(student);
	}

}
