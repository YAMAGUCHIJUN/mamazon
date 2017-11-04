package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ItemPrice;

@Repository
public interface ItemPriceRepository extends JpaRepository<ItemPrice, Long>{

}
