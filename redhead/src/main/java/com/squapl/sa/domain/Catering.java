package com.squapl.sa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Catering {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String mobileno;
	private String rating;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Catering(Long id, String name, String mobileno, String rating) {
		
		this.id = id;
		this.name = name;
		this.mobileno = mobileno;
		this.rating = rating;
	}
	
	public Catering() {
		super();
	}
	
	
}
