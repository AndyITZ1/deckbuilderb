package com.pokeview.PokeView;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.pokeview.repositories")
@EntityScan(basePackages = "com.pokeview")
@ComponentScan("com.pokeview")
public class PokeViewApplication {
	public static void main(String[] args) {
		SpringApplication.run(PokeViewApplication.class, args);
	}

}
