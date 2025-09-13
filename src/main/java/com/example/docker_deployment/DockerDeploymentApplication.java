package com.example.docker_deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerDeploymentApplication {

	@GetMapping("/")
	public String hello() {
		return "Hello Springboot how are you!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerDeploymentApplication.class, args);
	}

}
