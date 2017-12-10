package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ItemRepository;
import com.example.demo.entity.Item;

@Service
@Transactional
public class ItemService {

	@Autowired
    ItemRepository repository;

    public List<Item> findAll(){
        return repository.findAll();
    }
}
