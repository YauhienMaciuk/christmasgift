package com.epam.christmasgift.action;

import com.epam.christmasgift.comparator.SugarComparator;
import com.epam.christmasgift.entity.Confection;
import com.epam.christmasgift.entity.Gift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActionOverGift {
    private List<Confection> confectionList = null;

    public double weighing(Gift gift) {
        confectionList = gift.getConfectionList();
        double weightGift = 0;
        for (Confection confection : confectionList) {
            weightGift += confection.getWeight();
        }
        return weightGift;
    }

    public ArrayList<Confection> sorting(Gift gift) {
        confectionList = gift.getConfectionList();
        ArrayList<Confection> copyConfectionList = new ArrayList<>();
        copyConfectionList.addAll(confectionList);
        Collections.sort(copyConfectionList, new SugarComparator());
        return copyConfectionList;
    }

    public List<Confection> searchConfectionBySugar(Gift gift, double minQuantitySugar, double maxQuantitySugar) {
        ArrayList<Confection> listRequiredConfection = new ArrayList<Confection>();
        confectionList = gift.getConfectionList();
        for (Confection confection : confectionList) {
            if (maxQuantitySugar >= confection.getQuantitySugar() && confection.getQuantitySugar() >= minQuantitySugar) {
                listRequiredConfection.add(confection);
            }
        }
        return listRequiredConfection;
    }
}

