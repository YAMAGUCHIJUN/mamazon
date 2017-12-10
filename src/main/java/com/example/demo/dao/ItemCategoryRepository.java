package com.example.demo.dao;

import com.example.demo.entity.ItemCategories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCategoryRepository extends JpaRepository<ItemCategories, Long> {

	@Query(value = "select * from item_categories where category_depth = 0", nativeQuery = true)
	public List<ItemCategories> findTopCategories();

}
