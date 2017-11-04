package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountRepository;
import com.example.demo.entity.Account;

@Service
@Transactional
public class AccountService {

    @Autowired
    AccountRepository repository;

    public List<Account> findAll(){
        return repository.findAll(new Sort(Sort.Direction.ASC,"id"));

    };

    public Account findById(Long id) {
        return repository.findOne(id);
    }
}
