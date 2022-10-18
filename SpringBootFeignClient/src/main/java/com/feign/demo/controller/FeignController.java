package com.feign.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.feign.demo.model.Student;
import com.feign.demo.service.StudentFeignCallService;

@RestController
public class FeignController {
	
	@Autowired
	StudentFeignCallService studentFeignCallService;
	
	@GetMapping("/students")
	@ResponseStatus(HttpStatus.OK)
	public Student getStudent(){
		return  studentFeignCallService.getStudent();
	}
	
	@GetMapping("/poststudent")
	public Student postStudent(@RequestBody Student student){
		return  studentFeignCallService.postStudent(student);
	}

}
