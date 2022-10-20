package com.feign.demo.controller;

import javax.websocket.OnError;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.feign.demo.dto.User;
import com.feign.demo.model.Address;
import com.feign.demo.model.Territory;
import com.feign.demo.model.Student;
import com.feign.demo.service.StudentFeignCallService;

@RestController
public class FeignController {


	@Autowired
	StudentFeignCallService studentFeignCallService;

	@GetMapping("/students")
	@ResponseStatus(HttpStatus.OK)
	public Student getStudent() {
		return studentFeignCallService.getStudent();
	}

	@GetMapping("/poststudent")
	public Student postStudent(@RequestBody Student student) {
		return studentFeignCallService.postStudent(student);
	}

	@GetMapping("/multihasA")
	public ResponseEntity<Student> getHasArelationShip() {
		Student student = new Student();
		Address address = new Address();
		address.setFirstline("Ashok Vihar");
		address.setLandMark("Durga Mandir");
		Territory territory = new Territory();
		territory.setState("Bihar");
		territory.setCapital("Patna");
		student.setId("abc");
		student.setName("Vineet");
		student.setAddress(address);
		student.setTerritory(territory);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}

	@OnError
	public String getErrorMessage() {
		return "Error:404";
	}

	@GetMapping("/modelMapper")
	public ResponseEntity<User> getUser() {
		Student st = studentFeignCallService.getStudent();
		ModelMapper modelMapper=new ModelMapper();
		User user = modelMapper.map(st, User.class);
		return new ResponseEntity<>(user, HttpStatus.OK);

	}

}
