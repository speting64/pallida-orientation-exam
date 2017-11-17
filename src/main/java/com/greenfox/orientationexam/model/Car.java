package com.greenfox.orientationexam.model;

import javax.persistence.*;

@Entity
public class Car {

    String plate;
    String brand;
    String model;
    String year;
    String color;

    public Car(){

    }

    public Car(String plate,String brand, String model , String year, String color){

        this.plate=plate;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }


    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
