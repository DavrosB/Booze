package com.qa.exercises.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.exercises.domain.Person;

//this is an exercise from QA community

@RestController
public class PersonController {

	private List<Person> people = new ArrayList<>();

//	Automatic imports = ctrl - shift - o

	@GetMapping("/test")
	public String personTest() {
		return "This person is here";

	}

	@PostMapping("/createHuman")
	public String create(@RequestBody Person human) {
		this.people.add(human);
		return "Added human";
	}

	@GetMapping("readPeople")
	public List<Person> readPeople() {

		return this.people;
	
	}
	
	@DeleteMapping("/removePerson/{index}")
	public Person removePerson(@PathVariable int index) {
		return this.people.remove(index);
	
	}

	
	// Look in PathVariable @ index I, then replace the whole thing 
	// from RequestBody of type Person called newHuman
	@PutMapping("/replace/{index}") // replace the whole list
	public Person updateReplace(@PathVariable int index, @RequestBody Person newHuman) {
		this.people.set(index, newHuman);
		return newHuman;

	}
	
	
	
	

}
