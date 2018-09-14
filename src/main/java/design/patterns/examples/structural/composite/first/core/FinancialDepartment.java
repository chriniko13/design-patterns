package design.patterns.examples.structural.composite.first.core;

import java.util.Objects;

public class FinancialDepartment implements Department {

    private final String id;
    private final String name;

    public FinancialDepartment(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "FinancialDepartment{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinancialDepartment that = (FinancialDepartment) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
