package com.marlebas.ItauJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class ItauJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItauJavaApplication.class, args);
	}

}
