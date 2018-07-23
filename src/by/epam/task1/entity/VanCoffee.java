package by.epam.task1.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class VanCoffee {

    private List<CargoCoffee> cargoes = new ArrayList<>();

    public VanCoffee() {

    }

    public VanCoffee(ArrayList<CargoCoffee> cargoes) {
        this.cargoes = cargoes;
    }

    public List<CargoCoffee> getCargoes() {
        return cargoes;
    }

    public void setCargoes(List<CargoCoffee> cargoes) {
        this.cargoes = cargoes;
    }

    public void addCargoes(CargoCoffee... cargoes) {
        Collections.addAll(this.cargoes, cargoes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VanCoffee vanCoffee = (VanCoffee) o;
        return Objects.equals(cargoes, vanCoffee.cargoes);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cargoes == null) ? 0 : cargoes.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":\n"
                + " cargoes: " + cargoes;
    }
}
