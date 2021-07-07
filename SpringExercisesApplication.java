package com.qa.exercises;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;



@SpringBootApplication    //when this line executed - create beanbag; scan for component, find component, put it in beanbag

public class SpringExercisesApplication {

	public static void main(String[] args) {
		ApplicationContext beanbag = SpringApplication.run(SpringExercisesApplication.class, args);
		
		System.out.println(beanbag.containsBean("greeting"));
		System.out.println(beanbag.containsBean("clock"));
		System.out.println(beanbag.getBean("clock"));
		System.out.println(beanbag.getBean("greeting"));
		
	}

//	BEANS ARE MANAGED OBJECTS, Spring will CREATE, MANAGE and DESTROY these Objects for us
	
	
	@Bean
	public String greeting() { 
		return "Davros says hi";
}
	
	@Bean
	public LocalTime clock() {
		return LocalTime.now();
	
	
	}
	

}