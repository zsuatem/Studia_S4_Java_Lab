package com.company;

import java.util.Comparator;

public class ApplicationPriceComparator implements Comparator<Application> {

    @Override
    public int compare(Application o1, Application o2) {
        return o1.price.compareTo(o2.price);
    }
}
