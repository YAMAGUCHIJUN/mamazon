package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/toppage")
public class MainPageController {
	
    @RequestMapping(value="/",method=RequestMethod.GET)
    public void main(Model model){
    }

}
