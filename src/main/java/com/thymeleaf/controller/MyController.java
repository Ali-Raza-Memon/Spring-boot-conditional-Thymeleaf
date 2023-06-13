package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

@Controller
public class MyController {

    @GetMapping("/about")
    public String about(Model model){

        model.addAttribute("name","Ali Raza");
        model.addAttribute("currentDate", new Date());

        System.out.println("Inside about handler");
        return "about";
    }



    @GetMapping("/list")
    public String nameOfList(Model m){

        List<String> names = List.of("Yaseen","Kamran","Sohail","Zahid","Abrar");
        m.addAttribute("names",names);



        return "iterate";
    }


    @GetMapping("/condition")
    public String ConditionalHandler(Model m){
        m.addAttribute("isActive",true);
        return "conditional";
    }

}
