package design.patterns.examples.structural.composite.first.test;

import design.patterns.examples.structural.composite.first.core.FinancialDepartment;
import design.patterns.examples.structural.composite.first.core.HeadDepartment;
import design.patterns.examples.structural.composite.first.core.SalesDepartment;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        SalesDepartment salesDepartment = new SalesDepartment(UUID.randomUUID().toString(), "Sales Dept.");
        FinancialDepartment financialDepartment = new FinancialDepartment(UUID.randomUUID().toString(), "Financial Dept.");

        HeadDepartment headDepartment = new HeadDepartment(UUID.randomUUID().toString(), "Head Dept.");

        headDepartment.addChild(salesDepartment);
        headDepartment.addChild(financialDepartment);

        headDepartment.printName();
        headDepartment.printDepartmentNames();
    }
}
