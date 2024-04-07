package com.seshagiri.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.seshagiri.entity.ProductEntity;
import com.seshagiri.pojo.ProductDto;

@Service
public class ProductMapper {
	
	
	public ProductDto mapEntityToDTO(ProductEntity entity) {
		ProductDto dto = new ProductDto();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setCategory(entity.getCategory());
		dto.setCategoryType(entity.getCategoryType());
		dto.setCompany(entity.getCompany());
		return dto;		
	}
	
	public List<ProductDto> mapEntityToDTO(Iterator<ProductEntity> entityList) {		
		List<ProductDto> listDto = new ArrayList<ProductDto>();
		entityList.forEachRemaining(entity -> {
			ProductDto dto = mapEntityToDTO(entity);			
			listDto.add(dto);
		});		
		return listDto;		
	}
}
