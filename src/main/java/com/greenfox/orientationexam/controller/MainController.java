package com.greenfox.orientationexam.controller;

import com.greenfox.orientationexam.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sun.misc.Cache;

@Controller
public class MainController {

    @Autowired
    CarRepo carRepo;

    @GetMapping(value = "/")
    public String index(Model model){
        model.addAttribute("cars" , carRepo.findAll());
        return "cars";
    }

    @GetMapping(value = "/search")
    public String search



    /*@GetMapping(value="/")*/
}
