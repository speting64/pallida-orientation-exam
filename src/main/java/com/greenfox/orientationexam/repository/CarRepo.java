package com.greenfox.orientationexam.repository;

import com.greenfox.orientationexam.model.Car;

import org.springframework.data.repository.CrudRepository;

public interface CarRepo extends CrudRepository <Car , String> {

}
