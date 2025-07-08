package com.djk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/djk")
public class DjkApplication {

	@GetMapping("/")
	public String getDJK(){
		return "DJK";
	}

	public static void main(String[] args) {
		SpringApplication.run(DjkApplication.class, args);
	}

}
