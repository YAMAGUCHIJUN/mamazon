package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Item;
import com.example.demo.entity.ItemCategories;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

	@Query(value = "select * from items where name like '%:name%'", nativeQuery = true)
	public List<ItemCategories> findTItem();

}
