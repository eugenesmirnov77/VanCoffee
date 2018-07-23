package by.epam.task1.entity;

public enum StateCoffee {

    CORN(0), GROUND(1), INSTANT_CUP(2), INSTANT_PACK(3);

    private final int numStateCoffee;

    StateCoffee(int numStateCoffee) {

        this.numStateCoffee = numStateCoffee;
    }

    public int getNumStateCoffee() {
        return numStateCoffee;
    }
}
