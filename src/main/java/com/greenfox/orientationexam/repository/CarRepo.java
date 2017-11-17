package com.greenfox.orientationexam.repository;

import com.greenfox.orientationexam.model.LicencePlate;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CarRepo extends CrudRepository <LicencePlate, String> {

    List<LicencePlate>findAllByPlateIsLike(String plate);

}
