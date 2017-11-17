package com.greenfox.orientationexam.repository;

import com.greenfox.orientationexam.model.licencePlate;

import org.springframework.data.repository.CrudRepository;

public interface CarRepo extends CrudRepository <licencePlate, String> {

}
