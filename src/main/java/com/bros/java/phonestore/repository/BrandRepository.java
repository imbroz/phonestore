package com.bros.java.phonestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bros.java.phonestore.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
