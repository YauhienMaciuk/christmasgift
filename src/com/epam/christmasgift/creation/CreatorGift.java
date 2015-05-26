package com.epam.christmasgift.creation;

import com.epam.christmasgift.entity.*;
import com.epam.christmasgift.exception.ChristmasGiftException;

import java.util.ArrayList;
import java.util.List;

public class CreatorGift {

    public static Gift createGift(double averageWeightGift) throws ChristmasGiftException {
        List<Confection> confectionList = new ArrayList<Confection>();
        Gift gift = new Gift(confectionList);
        double currentWeightGift = 0;
        while (currentWeightGift < averageWeightGift) {
            Candies candies = new Candies();
            Chocolate chocolate = new Chocolate();
            Wafers wafers = new Wafers();
            int sortConfection = (int) (Math.random() * 6);
            switch (sortConfection) {
                case 0:
                    candies.setName("Korovka");
                    candies.setWeight(10.0);
                    candies.setQuantitySugar(7.5);
                    candies.setType(CandiesType.CARAMEL);
                    currentWeightGift += candies.getWeight();
                    confectionList.add(candies);
                    break;
                case 1:
                    candies.setName("Bialowieza Forest");
                    candies.setWeight(15.0);
                    candies.setQuantitySugar(9.2);
                    candies.setType(CandiesType.CHOCOLATE);
                    currentWeightGift += candies.getWeight();
                    confectionList.add(candies);
                    break;
                case 2:
                    chocolate.setName("Alionka");
                    chocolate.setWeight(90);
                    chocolate.setQuantitySugar(40);
                    chocolate.setColor("black");
                    currentWeightGift += chocolate.getWeight();
                    confectionList.add(chocolate);
                    break;
                case 3:
                    chocolate.setName("White bear");
                    chocolate.setWeight(100);
                    chocolate.setQuantitySugar(47.9);
                    chocolate.setColor("white");
                    currentWeightGift += chocolate.getWeight();
                    confectionList.add(chocolate);
                    break;
                case 4:
                    wafers.setName("lemon");
                    wafers.setWeight(50);
                    wafers.setQuantitySugar(22);
                    wafers.setStuffed(true);
                    currentWeightGift += wafers.getWeight();
                    confectionList.add(wafers);
                    break;
                case 5:
                    wafers.setName("Turtles");
                    wafers.setWeight(70);
                    wafers.setQuantitySugar(31.2);
                    wafers.setStuffed(false);
                    currentWeightGift += wafers.getWeight();
                    confectionList.add(wafers);
                    break;
                default:
                    throw new ChristmasGiftException("Не верно выбрана сладость");
            }
        }
        return gift;
    }
}
