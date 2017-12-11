package design.patterns.examples.creational.singleton.third.test;

import design.patterns.examples.creational.singleton.third.core.MySingleton;

public class Main {

    public static void main(String[] args) {

        int value = MySingleton.INSTANCE.getValue();

        System.out.println("value = " + value);

        MySingleton.INSTANCE.setValue(2);

        value = MySingleton.INSTANCE.getValue();

        System.out.println("value = " + value);

    }
}
