package com.names.app.web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.names.app.dto.Name;
import com.names.app.dto.Names;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class NameController {

	private List<Name> names;

	@PostConstruct
	private void parseNameList() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper om = new ObjectMapper();
		names = om.readValue(new File("src/main/resources/static/names.json"), Names.class).getNames();

	}

	@GetMapping("/names")
	public Iterable<Name> getNames() {
		return names;
	}
}
