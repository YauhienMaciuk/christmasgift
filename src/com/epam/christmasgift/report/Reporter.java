package com.epam.christmasgift.report;

import com.epam.christmasgift.action.ActionOverGift;
import com.epam.christmasgift.entity.Gift;
import com.epam.christmasgift.exception.ChristmasGiftException;
import com.epam.christmasgift.resourse.Constants;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static com.epam.christmasgift.resourse.Constants.MAX_QUANTITY_SUGAR;
import static com.epam.christmasgift.resourse.Constants.MIN_QUANTITY_SUGAR;

public class Reporter {

    public void christmasGiftReport(Gift gift, String filename) throws ChristmasGiftException {
        ActionOverGift actionOverGift = new ActionOverGift();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Constants.REPORT_FILE));) {
            writer.write("Отсортированный подарок по количеству сахара в конфете: " + '\n');
            writer.write(actionOverGift.sorting(gift).toString() + '\n');
            writer.write('\n' + "Вес подарка в граммах: ");
            writer.write(String.valueOf(actionOverGift.weighing(gift)) + '\n');
            writer.write("Конфеты, которые содержат сахар в диапазоне от 30 до 50 грамм: " + '\n');
            writer.write(actionOverGift.searchConfectionBySugar(gift, MIN_QUANTITY_SUGAR, MAX_QUANTITY_SUGAR).toString());
        } catch (IOException e) {
            throw new ChristmasGiftException("IOException in christmasGiftReporter", e);
        }
    }
}
