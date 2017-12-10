package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ItemCategoryRepository;
import com.example.demo.entity.ItemCategories;

@Service
@Transactional
public class ItemCategoriesService {
  
	@Autowired
    ItemCategoryRepository repository;
	
    public List<ItemCategories> findAll(){
        return repository.findAll();
    };
    
    public List<ItemCategories> findTopCategories(){
    	
		return null;
    }
}
