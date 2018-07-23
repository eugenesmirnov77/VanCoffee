package by.epam.task1.util;

import by.epam.task1.entity.Coffee;
import by.epam.task1.entity.Pack;
import by.epam.task1.entity.SortCoffee;
import by.epam.task1.entity.StateCoffee;

import java.util.Random;

public class CargoInit {

    private static final SortCoffee[] TYPES_OF_SORT = SortCoffee.values();
    private static final StateCoffee[] TYPES_OF_STATE = StateCoffee.values();

    public static void initCoffee(Coffee coffee) {

        Random random = new Random();
        coffee.setPrice(random.nextInt(100));
        coffee.setVolume(random.nextInt(100));
        coffee.setSortCoffee(TYPES_OF_SORT[random.nextInt(TYPES_OF_SORT.length)].toString());
        coffee.setStateCoffee(TYPES_OF_STATE[random.nextInt(TYPES_OF_STATE.length)].toString());
    }

    public static void initPack(Pack pack) {

        Random random = new Random();
        pack.setPackVolume(random.nextInt(100));

    }

}
