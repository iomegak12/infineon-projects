package com.infineon.practices.casestudy2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
@SpringBootApplication
@EnableAuthorizationServer
@SuppressWarnings("deprecation")
public class Casestudy2Application {

	public static void main(String[] args) {
		SpringApplication.run(Casestudy2Application.class, args);
	}

}
