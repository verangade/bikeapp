package com.mysoft.bike.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mysoft.bike.model.Bike;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikeController {
	
	@GetMapping
	public List<Bike> list(){
		List<Bike> bikes = new ArrayList<Bike>();
		return bikes;
		
	}
	
	@PostMapping
	@ResponseStatus()
	public void create() {
		
	}
	
	@GetMapping("/{id}")
	public Bike get(@PathVariable long id) {
		return new Bike();
	}

}
