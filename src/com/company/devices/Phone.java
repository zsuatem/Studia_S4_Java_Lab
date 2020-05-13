package com.company.devices;

import com.company.Human;

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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.couldBuy(this, price) && seller.hasDevice(this)) {
            buyer.setMobile(this);
            seller.setMobile(null);
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("Tranzakcja udana.");
        } else {
            System.out.println("Tranzakcja nie powiodła się!");
        }
    }
}
