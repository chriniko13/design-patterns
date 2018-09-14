package design.patterns.examples.structural.composite.first.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HeadDepartment implements Department {

    private final String id;
    private final String name;

    private List<Department> childDepartments;

    public HeadDepartment(String id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void addChild(Department department) {
        childDepartments.add(department);
    }

    public void removeChild(Department department) {
        childDepartments.remove(department);
    }

    public void printDepartmentNames() {
        childDepartments.forEach(Department::printName);
    }

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "SalesDepartment{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeadDepartment that = (HeadDepartment) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
}
