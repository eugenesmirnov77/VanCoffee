package by.epam.task1.service;

import by.epam.task1.entity.VanCoffee;

import java.util.Collections;

public class Sorter {

    public static void sortCoffeeByPrice(VanCoffee vanCoffee) {

        Collections.sort(vanCoffee.getCargoes());
    }
}
