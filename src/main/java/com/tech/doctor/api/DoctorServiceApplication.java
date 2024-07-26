package com.tech.doctor.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DoctorServiceApplication {

	
	@GetMapping("/getDoctor")
	public String getGp() {
		return "Gp service is called..";
	}
	
	@GetMapping("/getDoctorName/{name}")
	public String getGpName(@PathVariable String name) {
		return "Doctor "+name+" is available..!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DoctorServiceApplication.class, args);
	}

}
