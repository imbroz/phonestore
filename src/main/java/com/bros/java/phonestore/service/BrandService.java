package com.bros.java.phonestore.service;

import com.bros.java.phonestore.entity.Brand;

public interface BrandService {
	Brand create(Brand brand);
	Brand getById(Integer id);
	Brand update(Integer id, Brand brandUpdate);
}
