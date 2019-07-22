package com.covalense.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetConfig {

	@Bean
	public Pet getPet() {
		return new Pet();
	}

	@Bean(name="donkey")
	public Animal getD() {
		return new Donkey();
	}
	@Bean(name="monkey")
	public Animal getM() {
		return new Monkey();
	}

}
