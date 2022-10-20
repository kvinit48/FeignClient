package com.feign.demo.service;

import com.feign.demo.model.Student;

public interface StudentFeignCallService {
  
	public Student getStudent();
	
	public Student postStudent(Student student);
}
