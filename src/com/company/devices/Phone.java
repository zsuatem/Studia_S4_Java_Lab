package com.company.devices;

public class Phone extends Device {
    public Phone(String producer, String model) {
        super(producer, model);
    }

    public String toString() {
        return producer + " " + model;
    }

    @Override
    public void turnOn() {
        System.out.println(this.producer + " " + this.model + " uruchomiony. Witaj!");
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }
}
