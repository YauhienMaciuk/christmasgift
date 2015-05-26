package com.epam.christmasgift.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gift {
    private List<Confection> confectionList;

    public Gift() {
        this.confectionList = new ArrayList<Confection>();
    }

    public Gift(List<Confection> confectionList) {
        this.confectionList = confectionList;
    }


    public List<Confection> getConfectionList() {
        return Collections.unmodifiableList(confectionList);
    }

    public void setConfectionToGift(List<Confection> confectionList) {
        this.confectionList.clear();
        this.confectionList.addAll(confectionList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gift gift = (Gift) o;

        if (confectionList != null ? !confectionList.equals(gift.confectionList) : gift.confectionList != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return confectionList != null ? confectionList.hashCode() : 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append("Gift: ").append(confectionList).toString();
    }
}
