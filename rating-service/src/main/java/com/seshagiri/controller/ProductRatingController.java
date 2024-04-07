package com.seshagiri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seshagiri.pojo.ProductDto;
import com.seshagiri.service.ProductService;

@RestController
@RequestMapping("/rating")
public class ProductRatingController {
	
	@Autowired()
	private ProductService productService;
	
	@GetMapping("/{id}")
	public ProductDto getById(@PathVariable("id")Integer id) {
		return productService.getRatingById(id);
	} 	
	@GetMapping()
	public List<ProductDto> getAll() {
		return productService.getRating();
	}

}
