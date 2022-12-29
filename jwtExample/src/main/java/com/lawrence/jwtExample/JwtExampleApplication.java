package com.lawrence.jwtExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.lawrence.jwtExample.config.RsaKeyProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class JwtExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtExampleApplication.class, args);
	}

}
