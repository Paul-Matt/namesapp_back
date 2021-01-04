package com.names.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class NameApplication extends SpringBootServletInitializer {

	private static final Logger log = LoggerFactory.getLogger(NameApplication.class);

	@Autowired
	public static void main(String[] args) throws Exception {
		SpringApplication.run(NameApplication.class, args);
		log.debug("App started");
	}


}
