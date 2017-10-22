package com.example.demo.dao;

import com.example.demo.entity.Stockbases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockbaseRepository extends JpaRepository<Stockbases, Long> {

}
