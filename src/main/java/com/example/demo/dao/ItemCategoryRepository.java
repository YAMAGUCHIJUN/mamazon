package com.example.demo.dao;

import com.example.demo.entity.ItemCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCategoryRepository extends JpaRepository<ItemCategories, Long> {

}
