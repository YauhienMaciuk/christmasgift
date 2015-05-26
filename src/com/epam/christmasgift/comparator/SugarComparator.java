package com.epam.christmasgift.comparator;

import com.epam.christmasgift.entity.Confection;

import java.util.Comparator;

public class SugarComparator implements Comparator<Confection> {

    @Override
    public int compare(Confection confection1, Confection confection2) {
        double quantitySugarConfection1 = confection1.getQuantitySugar();
        double quantitySugarConfection2 = confection2.getQuantitySugar();
        if (quantitySugarConfection1 > quantitySugarConfection2) {
            return 1;
        } else if (quantitySugarConfection1 < quantitySugarConfection2) {
            return -1;
        } else {
            return 0;
        }
    }
}
