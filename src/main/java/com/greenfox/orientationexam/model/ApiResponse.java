package com.greenfox.orientationexam.model;

import java.util.List;

public class ApiResponse {

    String result;
    List <LicencePlate> data;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<LicencePlate> getData() {
        return data;
    }

    public void setData(List<LicencePlate> data) {
        this.data = data;
    }
}
