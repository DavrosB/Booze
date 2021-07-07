package com.qa.exercises.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.exercises.domain.Alcohol;
import com.qa.exercises.domain.Person;

import java.util.ArrayList;
import java.util.List;


@RestController
public class AlcoholController {
	
	private List<Alcohol> boozeList = new ArrayList<>();
	

//	Automatic imports = ctrl - shift - o

	@GetMapping("/test")
//	public String personTest() {
//		return "This person is here";

//	}

	@PostMapping("/createDrink")
	public String create(@RequestBody Alcohol drink) {
		this.boozeList.add(drink);
		return "Added drink";
	}

	@GetMapping("readPeople")
	public List<Alcohol> readDrink() {

		return this.boozeList;
	
	}
	
	@DeleteMapping("/removeDrink/{index}")
	public Alcohol removePerson(@PathVariable int index) {
		return this.boozeList.remove(index);
	
	}

	
	// Look in PathVariable @ index I, then replace the whole thing 
	// from RequestBody of type Person called newHuman
	@PutMapping("/replace/{index}") // replace the whole list
	public Alcohol updateReplace(@PathVariable int index, @RequestBody Alcohol newDrink) {
		this.boozeList.set(index, newDrink);
		return newDrink;

	}
	
	
	
	

}
