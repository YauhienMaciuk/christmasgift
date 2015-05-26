package com.epam.christmasgift.run;
/**
 * Задание: Новогодний подарок. Определить иерархию конфет и прочих сладостей. Создать несколько объектов-конфет.
 * Собрать детский подарок с определением его веса. Провести сортировку конфет в подарке на основе одного из параметров.
 * Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
 **/

import com.epam.christmasgift.creation.CreatorGift;
import com.epam.christmasgift.entity.Gift;
import com.epam.christmasgift.exception.ChristmasGiftException;
import com.epam.christmasgift.report.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import static com.epam.christmasgift.resourse.Constants.REPORT_FILE;

public class RunnerApplication {
    public static final Logger LOGGER = Logger.getLogger("RunnerApplication.class");

    static {
        new DOMConfigurator().doConfigure("config/log4j.xml", LogManager.getLoggerRepository());
    }

    public static void main(String[] args) {
        try {
            Gift gift = CreatorGift.createGift(1000);
            new Reporter().christmasGiftReport(gift, REPORT_FILE);
        } catch (ChristmasGiftException e) {
            LOGGER.error(e);
        }
    }
}
