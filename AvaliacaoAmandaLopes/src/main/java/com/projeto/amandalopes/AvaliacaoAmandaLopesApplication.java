package com.projeto.amandalopes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
@EntityScan(basePackages = "com.projeto.amandalopes.model") 
@ComponentScan(basePackages = "com.projeto.amandalopes.*")
@EnableJpaRepositories(basePackages="com.projeto.amandalopes.repository")
@EnableTransactionManagement
@RestController
@EnableAutoConfiguration


@SpringBootApplication
public class AvaliacaoAmandaLopesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvaliacaoAmandaLopesApplication.class, args);
	}

}
