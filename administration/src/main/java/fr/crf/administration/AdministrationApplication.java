package fr.crf.administration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.config.EnableAdminServer;

@EnableAutoConfiguration
@EnableAdminServer
@SpringBootApplication
public class AdministrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdministrationApplication.class, args);
	}
}
