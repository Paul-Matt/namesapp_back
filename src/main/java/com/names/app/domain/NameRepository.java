package com.names.app.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface NameRepository extends CrudRepository <Name, Long>{
	// Fetch given name
	List<Name>findByNameIgnoreCase(String name);
}
