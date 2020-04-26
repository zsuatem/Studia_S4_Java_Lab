package com.company;

public class Car {
    final String producer;
    final String model;
    private String plates;
    public Double value;
    public Integer yearOfProduction;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) {
        this.plates = plates;
    }
}
