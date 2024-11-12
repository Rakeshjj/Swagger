package com.kukmee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name = "Student", description = "API for managing students")
public class StudentController {

	@Autowired
	private StudentRepo studentRepo;

    @Operation(summary = "Save a new student", description = "This endpoint saves a new student in the database.")
    @PostMapping("/students")
	public ResponseEntity<?> save(@RequestBody Student student) {
		studentRepo.save(student);
		return ResponseEntity.ok("saved..");

	}
}
