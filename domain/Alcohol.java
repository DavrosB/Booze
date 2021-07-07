package com.qa.exercises.domain;

public class Alcohol {
	
	// Variables
		private String brand;
		private String name;
		private int volume;
		private String country;

		// Default Constructor
		public Alcohol() {
		}

		// Generate Constructor with Fields

		public Alcohol(String brand, String name, int volume, String country) {
			super();
			this.brand = brand;
			this.name = name;
			this.volume = volume;
			this.country = country;
		}

		
//		create Getters and Setters
		
		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getVolume() {
			return volume;
		}

		public void setVolume(int volume) {
			this.volume = volume;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}


		
		
		
		

	}

	
	
	


