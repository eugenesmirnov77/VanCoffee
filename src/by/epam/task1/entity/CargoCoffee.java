package by.epam.task1.entity;


public class CargoCoffee implements Comparable<CargoCoffee> {

    protected static final int NEGATIVE = 0;
    protected static final int POSITIVE = 1;

    protected int number;

    public CargoCoffee() {

    }

    public CargoCoffee(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(CargoCoffee o) {
        return o instanceof Coffee ? NEGATIVE : POSITIVE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CargoCoffee that = (CargoCoffee) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + number;
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{"
                + " numbers = " + number + "}";
    }
}
