package design.patterns.examples.creational.builder.first.test;

import design.patterns.examples.creational.builder.first.core.Student;

public class Main {

    public static void main(String[] args) {


        Student student = new Student
                .StudentBuilder("111066")
                .withFirstname("Niko")
                .withInitials("T")
                .withSurname("Chri")
                .withTelephone("123456789")
                .build();

        System.out.println(student);

    }
}
