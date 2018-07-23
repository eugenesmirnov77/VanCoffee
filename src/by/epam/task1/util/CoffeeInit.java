package by.epam.task1.util;

import by.epam.task1.entity.Coffee;
import by.epam.task1.entity.Pack;
import by.epam.task1.entity.VanCoffee;
import java.util.Random;
import java.util.logging.Logger;

public class CoffeeInit {

    public static void initVanCoffee(VanCoffee vanCoffee, int numberOfCargoes, Logger logInfo) {

        Random random = new Random();
        for (int i = 0; i < numberOfCargoes; i++) {
            if (random.nextBoolean()) {
                Coffee coffee = new Coffee();
                coffee.setNumber(getRandomInt(0, 20));
                CargoInit.initCoffee(coffee);
                vanCoffee.addCargoes(coffee);
            } else {

                Pack pack = new Pack();
                pack.setNumber(getRandomInt(0,20));
                CargoInit.initPack(pack);
                vanCoffee.addCargoes(pack);
            }
        }


    }

    private static int getRandomInt(int leftBorder, int rightBorder){
        return new Random().nextInt(rightBorder - leftBorder) + leftBorder;
    }
}
