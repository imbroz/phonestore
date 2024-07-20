package com.bros.java.phonestore.service.util;

import com.bros.java.phonestore.dto.BrandDTO;
import com.bros.java.phonestore.entity.Brand;

public class Mapper {
	
	public static Brand toBrand(BrandDTO dto) {
		Brand brand = new Brand();
		//brand.setId(dto.getId());
		brand.setName(dto.getName());
		return brand;
		
	}
	public static BrandDTO toBrandDTO(Brand brand) {
		BrandDTO brandDTO = new BrandDTO();
		brandDTO.setName(brand.getName());
		return brandDTO;
	}

}
