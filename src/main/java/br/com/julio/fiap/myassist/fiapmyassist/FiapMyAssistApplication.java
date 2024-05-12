package br.com.julio.fiap.myassist.fiapmyassist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.julio.fiap.myassist.fiapmyassist")
public class FiapMyAssistApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiapMyAssistApplication.class, args);
	}

}
