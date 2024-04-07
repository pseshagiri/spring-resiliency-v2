package com.seshagiri.repo;

import org.springframework.data.repository.CrudRepository;

import com.seshagiri.entity.ProductEntity;

public interface RatingRepository extends CrudRepository<ProductEntity, Integer>{
	

}
