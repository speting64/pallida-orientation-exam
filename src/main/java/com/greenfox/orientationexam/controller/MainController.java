package com.greenfox.orientationexam.controller;

import com.greenfox.orientationexam.model.LicencePlate;
import com.greenfox.orientationexam.repository.CarRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sun.misc.Cache;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
public class MainController {

    String plate;

    @Autowired
    CarRepo carRepo;

    @GetMapping(value = "/")
    public String index(Model model ){
        model.addAttribute("cars" , carRepo.findAll());
        return "cars";
    }

    @GetMapping(value = "/search")
    public String search(Model model , @RequestParam (required = false) String search){
        if(search != null) {
            model.addAttribute("cars", carRepo.findAllByPlateIsLike("%" + search + "%"));
        }
        return "cars";
    }

    @GetMapping(value = "/search/{brand}")
    public String searchByBrand(Model model , @RequestParam (required = false) String search){
        if(search != null) {
            model.addAttribute("cars", carRepo.findAllByBrandIsLike("%" + search + "%"));
        }
        return "cars";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("plate") String plate) {
        model.addAttribute("plate", carRepo.findOne(plate).getPlate());
        model.addAttribute("policecar", carRepo.findOne(plate).isPoliceCar());
        model.addAttribute("diplomat", carRepo.findOne(plate).isDiplomat());
        this.plate = plate;
        return "update";
    }

    @PostMapping("/edit/update")
    public String update(@RequestParam("/") String plates,
                         @RequestParam(name = "policecar", required = false) String policeCar,
                         @RequestParam(name = "diplomat", required = false) String diplomat){
        LicencePlate save = carRepo.findOne(plate);
        if(!plates.equals("")){
            save.setPlate(plates);
        }
        save.setPoliceCar(Boolean.valueOf(policeCar));
        save.setDiplomat(Boolean.valueOf(diplomat));
        carRepo.save(save);
        return "redirect:/cars";

    }




}
