package com.company.devices;

public class Car {
    final String producer;
    final String model;
    private String plates;
    public Double value = 10000.0;
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

    public String toString() {
        return producer + " " + model + " " + plates;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }
}
