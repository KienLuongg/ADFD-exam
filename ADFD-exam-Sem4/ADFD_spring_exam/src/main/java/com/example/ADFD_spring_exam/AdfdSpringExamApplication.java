package com.example.ADFD_spring_exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AdfdSpringExamApplication {
	public static void main(String[] args) {
		SpringApplication.run(AdfdSpringExamApplication.class, args);
	}
}

@RestController
class PlaceController {

	@GetMapping("/getAllPlace")
	public List<String> getAllPlace() {
		return Arrays.asList("Destination 1", "Destination 2", "Destination 3");
	}
}