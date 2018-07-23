package by.epam.task1.runner;

import by.epam.task1.entity.VanCoffee;
import by.epam.task1.service.Searcher;
import by.epam.task1.service.Sorter;
import by.epam.task1.util.CoffeeInit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Runner {

    private static final Logger LOG_INFO = Logger.getLogger(String.valueOf(Runner.class));

    public static void main(String[] args) {

        VanCoffee vanCoffee = new VanCoffee();

        int numberOfCargoes = 10;
        CoffeeInit.initVanCoffee(vanCoffee, numberOfCargoes, LOG_INFO);
        LOG_INFO.log(Level.INFO, String.valueOf(vanCoffee));


        Sorter.sortCoffeeByPrice(vanCoffee);
        LOG_INFO.log(Level.INFO, String.valueOf(vanCoffee));


        double minVolume = 1.0;
        double maxVolume = 10.0;

        Searcher.findCargoesByVolume(vanCoffee, minVolume, maxVolume, LOG_INFO);

    }
}