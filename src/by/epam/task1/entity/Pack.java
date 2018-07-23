package by.epam.task1.entity;

public class Pack extends CargoCoffee{

    private double packVolume;

    public Pack() {
        super();
    }

    public Pack(int number, double packVolume) {

        super(number);
        this.packVolume = packVolume;
    }

    public double getPackVolume() {
        return packVolume;
    }

    public void setPackVolume(double packVolume) {
        this.packVolume = packVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pack pack = (Pack) o;
        return Double.compare(pack.packVolume, packVolume) == 0;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = super.hashCode();
        result += prime * result + packVolume;
        return result;

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "Pack{" +
                "packVolume=" + packVolume +
                ", number=" + number +
                '}';
    }
}
