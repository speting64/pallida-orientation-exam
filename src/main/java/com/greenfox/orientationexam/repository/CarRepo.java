package com.greenfox.orientationexam.repository;

import com.greenfox.orientationexam.model.LicencePlate;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CarRepo extends CrudRepository <LicencePlate, String> {

    List<LicencePlate>findAllByPlateIsLike(String plate);
    List<LicencePlate>findAllByBrandIsLike(String brand);
    List<LicencePlate>findAllByBrandStartsWith(String brand);
    List<LicencePlate>findAllPlateStartsWith(String plate);
    List<LicencePlate>findAllByBrand(String brand);


}
