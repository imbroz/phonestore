package com.bros.java.phonestore.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.bros.java.phonestore.entity.Brand;
import com.bros.java.phonestore.exception.ApiException;
import com.bros.java.phonestore.exception.ResourceNotFoundException;
import com.bros.java.phonestore.repository.BrandRepository;
import com.bros.java.phonestore.service.BrandService;


@Service
public class BrandServiceImpl implements BrandService{
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public Brand create(Brand brand) {
		return brandRepository.save(brand);
	}

	@Override
	public Brand getById(Integer id) {
		return brandRepository.findById(id)
		.orElseThrow(()-> new ResourceNotFoundException("Brand", id));
	}

	@Override
	public Brand update(Integer id, Brand brandUpdate) {
		Brand brand = getById(id);
		brand.setName(brandUpdate.getName());
		return brandRepository.save(brand);
	}

}
