package com.names.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import com.names.app.domain.Name;
import com.names.app.domain.NameRepository;

@SpringBootApplication
public class NameApplication extends SpringBootServletInitializer {

	private static final Logger log = LoggerFactory.getLogger(NameApplication.class);

	@Autowired
	public static void main(String[] args) throws Exception {
		SpringApplication.run(NameApplication.class, args);
	}

	@Bean
	public CommandLineRunner namesRunner(NameRepository repository) {
		return args -> {
			// Save namedata to database
			repository.save(new Name("Ville", 24));
			repository.save(new Name("Anna", 6));
			repository.save(new Name("Antti", 22));
			repository.save(new Name("Sanna", 5));
			repository.save(new Name("Mikko", 19));
			repository.save(new Name("Minna", 5));
			repository.save(new Name("Timo", 18));
			repository.save(new Name("Satu", 5));
			repository.save(new Name("Tuomas", 16));
			repository.save(new Name("Tiina", 5));
			repository.save(new Name("Tero", 15));
			repository.save(new Name("Kati", 5));
			repository.save(new Name("Sami", 15));
			repository.save(new Name("Henna", 4));
			repository.save(new Name("Mika", 12));
			repository.save(new Name("Liisa", 4));
			repository.save(new Name("Janne", 12));
			repository.save(new Name("Paula", 4));
			repository.save(new Name("Petri", 11));
			repository.save(new Name("Suvi", 4));
		};
	}


}
