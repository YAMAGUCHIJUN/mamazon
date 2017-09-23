package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MamazonController {
    @RequestMapping("/hoge")
    public String mainpage(Model model) {
        return "hoge";
    }
}
