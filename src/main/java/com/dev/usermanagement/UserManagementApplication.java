package com.dev.usermanagement;

import com.dev.usermanagement.employee.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class UserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
	}

	@GetMapping
	public List<Employee> hello(){
		return List.of(new Employee(1L,"akila","akila@gmail.com", LocalDate.of(1997, Month.MARCH, 29), 21));

	}
}
