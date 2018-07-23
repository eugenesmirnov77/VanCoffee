package by.epam.task1.entity;

public enum SortCoffee {

    ARABICA(0), ROBUSTA(1), LIBERICA(2), EXCELSA(3);

    private final int numSortCoffee;

    SortCoffee(int numSortCoffee) {
        this.numSortCoffee = numSortCoffee;
    }

    public int getNumSortCoffee() {
        return numSortCoffee;
    }
}
