package com.individual_s7.reaction_service;

import org.springframework.boot.SpringApplication;

public class TestReactionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(ReactionServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
