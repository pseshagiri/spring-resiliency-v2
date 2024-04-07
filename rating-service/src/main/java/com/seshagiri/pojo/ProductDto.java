package com.seshagiri.pojo;

import java.io.Serializable;

public class ProductDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1243106542471478116L;
	
	private Integer id;	
	private String name;	
	private String category;	
	private String categoryType;	
	private double rating;	
	private String company;
	
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public ProductDto(Integer id , String name, String category, String categoryType, double rating, String company) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.categoryType = categoryType;
		this.rating = rating;
		this.company = company;
	}
	public ProductDto() {}

}
