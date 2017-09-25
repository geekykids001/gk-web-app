package com.geekykids.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

	private String name;
	private String imageUrl;
	private double price;
	private short ageFrom;
	private short ageTo;
	private String description;

	public Course() {
	}
	
	public Course(String name, String imageUrl, double price, short ageFrom, short ageTo, String description) {
		super();
		this.name = name;
		this.imageUrl = imageUrl;
		this.price = price;
		this.ageFrom = ageFrom;
		this.ageTo = ageTo;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public short getAgeFrom() {
		return ageFrom;
	}

	public void setAgeFrom(short ageFrom) {
		this.ageFrom = ageFrom;
	}

	public short getAgeTo() {
		return ageTo;
	}

	public void setAgeTo(short ageTo) {
		this.ageTo = ageTo;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}