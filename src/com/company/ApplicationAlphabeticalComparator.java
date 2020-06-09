package com.company;

import java.util.Comparator;

public class ApplicationAlphabeticalComparator implements Comparator<Application> {

    @Override
    public int compare(Application o1, Application o2) {
        return o1.name.compareTo(o2.name);
    }
}
