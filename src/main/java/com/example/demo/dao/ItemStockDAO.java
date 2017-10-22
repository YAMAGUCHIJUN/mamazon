package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ItemStock;

@Repository
public interface ItemStockDAO extends JpaRepository<ItemStock, Long>{

}
