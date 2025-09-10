package com.example.spring_boot_oauth2_jwt_maven_exemplo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot_oauth2_jwt_maven_exemplo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
