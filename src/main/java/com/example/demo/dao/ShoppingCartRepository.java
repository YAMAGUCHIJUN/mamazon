package com.example.demo.dao;

import com.example.demo.entity.ShoppingCarts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCarts, Long> {

}
