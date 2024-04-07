package com.seshagiri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seshagiri.entity.ProductEntity;
import com.seshagiri.mapper.ProductMapper;
import com.seshagiri.pojo.ProductDto;
import com.seshagiri.repo.RatingRepository;

@Service
public class ProductService {
	
	@Autowired()
	RatingRepository ratingRepository;
	
	@Autowired()
	ProductMapper productMapper;
	
	public ProductDto getRatingById(Integer id) {
		return productMapper.mapEntityToDTO(ratingRepository.findById(id).get());
	}
	
	public List<ProductDto> getRating() {
		return productMapper.mapEntityToDTO(ratingRepository.findAll().iterator());
	}
	

}
