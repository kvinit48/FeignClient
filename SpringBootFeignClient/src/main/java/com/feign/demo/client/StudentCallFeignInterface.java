package com.feign.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.feign.demo.config.FeignClientConfig;
import com.feign.demo.model.Student;

@FeignClient(name="studentCall",url = "http://localhost:3000",configuration = {FeignClientConfig.class})
public interface StudentCallFeignInterface {
	
	@GetMapping("/students")
	public Student getStudent();
	
	@PostMapping("/poststudent")
	public Student postStudent(@RequestBody Student student);

}
