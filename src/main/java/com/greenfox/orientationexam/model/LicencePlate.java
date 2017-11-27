package com.greenfox.orientationexam.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "licence_plates")
public class LicencePlate {

    @Id
    String plate;

    @Column(name = "car_brand")  //Translates in the SQL table
    @JsonProperty(value = "car_brand")
    String brand;

    @Column(name = "car_model")
    @JsonProperty(value = "car_model")
    String model;
    String year;
    String color;
    boolean policeCar;
    boolean diplomat;

    public LicencePlate(){

    }

    public LicencePlate(String plate, String brand, String model , String color, String year,
                        boolean isPoliceCar,boolean isDiplomat){

        this.plate=plate;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.policeCar=policeCar;
        this.diplomat=diplomat;
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

    public boolean isPoliceCar() {
        return policeCar;
    }

    public void setPoliceCar(boolean policeCar) {
        this.policeCar=policeCar;
    }

    public boolean isDiplomat() {
        return diplomat;
    }

    public void setDiplomat(boolean diplomat) {
        this.diplomat=diplomat;
    }
}
