package com.seshagiri.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity()
@Table(name="product_rating")

public class ProductEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5737430410087870622L;
	
	@Id()
	@SequenceGenerator(name = "product_seq",sequenceName = "product_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="product_seq")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="category")
	private String category;
	@Column(name="categoryType")
	private String categoryType;
	@Column(name="rating")
	private double rating;
	@Column(name="company")
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
	public ProductEntity(Integer id,String name, String category, String categoryType, double rating, String company) {
		this.id = id; 
		this.name = name;
		this.category = category;
		this.categoryType = categoryType;
		this.rating = rating;
		this.company = company;
	}
	public ProductEntity() {}
}
