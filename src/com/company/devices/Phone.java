package com.company.devices;

import com.company.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone extends Device {
    private ArrayList<Application> myApps = new ArrayList<>();

    public Phone(String producer, String model) {
        super(producer, model, 100.0);
    }

    public String toString() {
        return producer + " " + model;
    }

    static final String DEFAULT_APP_SERVER_URL = "thebestapps.com";
    static final String DEFAULT_APP_VERSION = "latest";
    static final String DEFAULT_PROTOCOL = "https://";

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

    public void installAnApp(String applicationName) {
        installAnApp(applicationName, DEFAULT_APP_VERSION, DEFAULT_APP_SERVER_URL);
    }

    public void installAnApp(String applicationName, String version) {
        installAnApp(applicationName, version, DEFAULT_APP_SERVER_URL);
    }

    public void installAnApp(String applicationName, String version, String serverURL) {
        System.out.println("Zainstalowano aplikację: " + applicationName + "\n\tWersja: " + version + "\n\tZ serwera: " + DEFAULT_PROTOCOL + serverURL);
    }

    public void installAnApp(List<String> applicationsNames) {
        for (String appName : applicationsNames) {
            installAnApp(appName);
        }
    }

    public void installAnApp(URL appInfo) {
        installAnApp(appInfo.getApplicationName(), appInfo.getVersion(), appInfo.getServerURL());
    }

    public void installNewApp(Human phoneOwner, Application app) {
        if (phoneOwner.cash >= app.price) {
            phoneOwner.cash -= app.price;
            myApps.add(app);
            System.out.println("Istalacja przebiegła pomyślnie");
        }
    }

    public boolean isInstalled(Application app) {
        for (Application myApp : myApps) {
            if (myApp == app) {
                return true;
            }
        }
        return false;
    }

    public boolean isInstalled(String appName) {
        for (Application myApp : myApps) {
            if (myApp.name.equals(appName)) {
                return true;
            }
        }
        return false;
    }

    public void getAllFreeInstalledApp() {
        for (Application myApp : myApps) {
            if (myApp.price == 0.0) {
                System.out.println(myApp.name + " " + myApp.version);
            }
        }
    }

    public void getAllInstalledApp() {
        for (Application myApp : myApps) {
            System.out.println(myApp.name + " " + myApp.version);
        }
    }

    public Double getValueOFAllInstalledApp() {
        Double sum = 0.0;
        for (Application myApp : myApps) {
            sum += myApp.price;
        }
        return sum;
    }

    public void sortMyAppsByName() {
        Collections.sort(myApps, new ApplicationAlphabeticalComparator());
    }

    public void sortMyAppsByValue() {
        Collections.sort(myApps, new ApplicationPriceComparator());
    }
}
