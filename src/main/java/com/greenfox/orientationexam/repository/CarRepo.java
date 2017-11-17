package com.greenfox.orientationexam.repository;

import com.greenfox.orientationexam.model.LicencePlate;

import org.springframework.data.repository.CrudRepository;

public interface CarRepo extends CrudRepository <LicencePlate, String> {

}
