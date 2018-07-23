package by.epam.task1.entity;

public class Coffee extends CargoCoffee{

    private double price;
    private double volume;
    private SortCoffee sortCoffee;
    private StateCoffee stateCoffee;


    public Coffee() {
        super();
    }

    public Coffee(int number, double price, double volume, String sortCoffee, String stateCoffee) {
        super(number);
        this.price = price;
        this.volume = volume;
        this.sortCoffee = SortCoffee.valueOf(sortCoffee);
        this.stateCoffee = StateCoffee.valueOf(stateCoffee);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getSortCoffee() {
        return sortCoffee.toString();
    }

    public void setSortCoffee(String sortCoffee) {

        switch (sortCoffee) {
            case "ARABICA":
                this.sortCoffee = SortCoffee.ARABICA;
                break;
            case "ROBUSTA":
                this.sortCoffee = SortCoffee.ROBUSTA;
                break;
            case "LIBERICA":
                this.sortCoffee = SortCoffee.LIBERICA;
                break;
            case "EXCELSA":
                this.sortCoffee = SortCoffee.EXCELSA;
                break;
        }
    }

    public String getStateCoffee() {
        return stateCoffee.toString();
    }

    public void setStateCoffee(String stateCoffee) {

        switch (stateCoffee) {
            case "CORN":
                this.stateCoffee = StateCoffee.CORN;
                break;
            case "GROUND":
                this.stateCoffee = StateCoffee.GROUND;
                break;
            case "INSTANT_CUP":
                this.stateCoffee = StateCoffee.INSTANT_CUP;
                break;
            case "INSTANT_PACK":
                this.stateCoffee = StateCoffee.INSTANT_PACK;
                break;
        }

    }

    @Override
    public int compareTo(CargoCoffee cargoCoffee) {
        if (cargoCoffee instanceof Coffee) {
            return this.sortCoffee.getNumSortCoffee() < ((Coffee)cargoCoffee).sortCoffee.getNumSortCoffee() ? NEGATIVE : POSITIVE;
        }

        return POSITIVE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coffee coffee = (Coffee) o;
        return Double.compare(coffee.price, price) == 0 &&
                Double.compare(coffee.volume, volume) == 0 &&
                sortCoffee == coffee.sortCoffee &&
                stateCoffee == coffee.stateCoffee;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result += prime * result + price;
        result += prime * result + volume;
        result += prime * result + ((sortCoffee == null) ? 0 : sortCoffee.hashCode()) + ((stateCoffee == null) ? 0 : stateCoffee.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "Coffee{" +
                "price=" + price +
                ", volume=" + volume +
                ", sortCoffee=" + sortCoffee +
                ", stateCoffee=" + stateCoffee +
                ", number=" + number +
                '}';
    }
}
