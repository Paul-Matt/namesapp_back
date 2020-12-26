package com.names.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.names.app.domain.Name;
import com.names.app.domain.NameRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class NameController {
	
	@Autowired
	private NameRepository repository;
	
	@GetMapping("/names")
	public Iterable<Name> getNames() {
		return repository.findAll();
	}
}
