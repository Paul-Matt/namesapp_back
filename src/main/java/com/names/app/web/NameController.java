package com.names.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.names.app.domain.Name;
import com.names.app.domain.NameRepository;

@RestController
public class NameController {
	
	@Autowired
	private NameRepository repository;

	@RequestMapping("/names")
	public Iterable<Name> getNames() {
		return repository.findAll();
	}
}
