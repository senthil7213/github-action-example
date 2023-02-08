package com.cicd.cicdpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdpipelineApplication {

	@RequestMapping("/welcome")
	public String name() {
		return "welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdpipelineApplication.class, args);
	}

}
