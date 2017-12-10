package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.ItemCategoriesService;

@Controller
@RequestMapping("/toppage")
public class MainPageController {
    @Autowired
    ItemCategoriesService service;
    
    @RequestMapping(value="/",method=RequestMethod.GET)
    public void main(Model model){
//    	service.findTopCategories().forEach(str->System.out.println(str.getName()));
    	List<String> categoryList = new ArrayList<>();
    	service.findTopCategories().forEach(s->categoryList.add(s.getName()));
    	model.addAttribute("categoryList",service.findTopCategories());
    }

}
