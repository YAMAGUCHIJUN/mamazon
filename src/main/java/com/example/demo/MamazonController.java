package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/index")
public class MamazonController {
    @Autowired
    AccountService service;

    @RequestMapping(value="/",method=RequestMethod.GET)
    public void index(){
        service.findAll().stream().map(a->a.getName()).forEach(System.out::println);
    }
//    public String mainpage(Model model) {
//        return "hoge";
//    }
}
