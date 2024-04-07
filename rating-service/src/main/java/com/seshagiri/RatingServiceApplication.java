package com.seshagiri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.seshagiri.entity.ProductEntity;
import com.seshagiri.repo.RatingRepository;

@SpringBootApplication
@EnableDiscoveryClient()
public class RatingServiceApplication {
	
	
	@Autowired()
	RatingRepository ratingRepository;

	public static void main(String[] args) {
		SpringApplication.run(RatingServiceApplication.class, args);
	}
	
	@Bean()
	public CommandLineRunner ratingProduct(RatingRepository ratingRepository) {
		
		return (args)-> {
			ratingRepository.save(new ProductEntity(1,"A50","Electronic","Mobile", 4.3,"Samsumg"));
			ratingRepository.save(new ProductEntity(2,"Series 15","Electronic","Mobile", 3.9,"RealMe"));
			ratingRepository.save(new ProductEntity(3,"45","Electronic","Mobile", 4.9,"OnePlus"));
		};
	}

}
