package br.com.telzir.falemais;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FalemaisApplication {

	public static void main(String[] args) {
		SpringApplication.run(FalemaisApplication.class, args);
	}

}
