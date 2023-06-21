package com.bbva.logging;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class LoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);
		log.info("Hello Spring Boot");
		log.debug("Debug log message");
		log.info("Info log message");
		log.error("Error log message");
		log.warn("Warn log message");
		log.trace("Trace log message");
		log.fatal("Fatal log message");
		
	}

}
