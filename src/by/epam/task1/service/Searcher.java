package by.epam.task1.service;

import by.epam.task1.entity.CargoCoffee;
import by.epam.task1.entity.Coffee;
import by.epam.task1.entity.VanCoffee;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Searcher {

    public static void findCargoesByVolume(VanCoffee vanCoffee,
                                           double minValue, double maxValue, Logger logInfo) {

        boolean flag = false;
        for (CargoCoffee cargo : vanCoffee.getCargoes()) {
            if (cargo instanceof Coffee &&
                    CargoRange((Coffee) cargo, minValue, maxValue)) {
                flag = true;
                logInfo.log(Level.INFO, String.valueOf(cargo));
            }
        }
        if (!flag) {
            logInfo.log(Level.INFO, "There are no cargoes with your range.");
        }
    }

    public static boolean CargoRange(Coffee coffee, double minValue, double maxValue) {

        return coffee.getVolume() >= minValue
                && coffee.getVolume() <= maxValue;
    }
}
