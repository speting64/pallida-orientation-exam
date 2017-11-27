package com.greenfox.orientationexam.controller;

import com.greenfox.orientationexam.model.ApiResponse;
import com.greenfox.orientationexam.model.LicencePlate;
import com.greenfox.orientationexam.repository.CarRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sun.misc.Cache;

import java.util.List;


@Controller
public class MainController {


    @Autowired
    CarRepo carRepo;

    @GetMapping(value = "/search")
    public String index(Model model ,
                        @RequestParam (required = false) Boolean police ,
                        @RequestParam (required = false) Boolean diplomat,
                        @RequestParam (required = false) String q){
        if(police != null){
            model.addAttribute("cars", carRepo.findAllByPlateIsLike("RB%"));
        }else if(diplomat != null) {
            model.addAttribute("cars", carRepo.findAllByPlateIsLike("DT%"));
        }else if(q != null){
            if(!q.matches("^[a-zA-Z0-9-]*$") && q.length() < 7) {
                model.addAttribute("cars", carRepo.findAllByPlateIsLike("%" + q + "%"));
            } else {
                model.addAttribute("error","Sorry, the submitted licence plate is not valid");
            }
        }else{
            model.addAttribute("cars" , carRepo.findAll());
        }
        return "cars";
    }

    @GetMapping(value = "/search/{brand}")
    public String brand(Model model , @PathVariable String brand){
        model.addAttribute("cars", carRepo.findAllByBrand(brand));
        return "cars";
    }

    @GetMapping(value = "api/search/{brand}")
    @ResponseBody
    public ApiResponse api(@PathVariable String brand) {
        return new ApiResponse(carRepo.findAllByBrand(brand));
    }

    public List<LicencePlate> findAllByPlateStartingWith(String plateStart){
        return carRepo.findAllByBrandIsLike(plateStart + "%");
    }
}
