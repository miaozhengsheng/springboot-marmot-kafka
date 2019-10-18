package com.marmot.kafka.kafkademo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.marmot.kafka.kafkademo.consume.MessageProducer;

@SpringBootApplication
public class KafkaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaDemoApplication.class, args);
	}
	
	@Bean
	public ApplicationRunner producer(MessageProducer producer){
		
		return (args)->{
			// producer.onMessage("");
		};
	}

}
