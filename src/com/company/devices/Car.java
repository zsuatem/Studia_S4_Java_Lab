package com.company.devices;

public class Car extends Device {
    private String plates;
    public Double value = 10000.0;

    public Car(String producer, String model) {
        super(producer, model);
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

    @Override
    public void turnOn() {
        System.out.println("Samochód " + this.producer + " " + this.model + " uruchomiony. Możesz jechać!");
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }
}
