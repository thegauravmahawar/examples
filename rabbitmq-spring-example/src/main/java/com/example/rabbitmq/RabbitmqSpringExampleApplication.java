package com.example.rabbitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableRabbit
public class RabbitmqSpringExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqSpringExampleApplication.class, args);
	}

}
