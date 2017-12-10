package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ItemService service;
    
    @RequestMapping(value="/",method=RequestMethod.GET)
    public void index(Model model){
    	Item item = service.findById(1);
    	System.out.println(item.getId());
    	System.out.println(item.getName());

    }
}
