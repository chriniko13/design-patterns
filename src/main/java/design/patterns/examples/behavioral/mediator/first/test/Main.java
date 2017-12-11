package design.patterns.examples.behavioral.mediator.first.test;

import design.patterns.examples.behavioral.mediator.first.core.MediatorImpl;
import design.patterns.examples.behavioral.mediator.first.domain.Info;

public class Main {

    public static void main(String[] args) {


        MediatorImpl mediator = new MediatorImpl();

        Info info1 = new Info(mediator, "info1");
        Info info2 = new Info(mediator, "info2");
        Info info3 = new Info(mediator, "info3");
        Info info4 = new Info(mediator, "info4");

        mediator.register(info1);
        mediator.register(info2);
        mediator.register(info3);
        mediator.register(info4);

        info1.publish("hello, good morning!");
        System.out.println();

        info2.publish("hello, good morning!");
        System.out.println();

        info3.publish("hello, good morning!");
        System.out.println();

        info4.publish("hello, good morning!");
        System.out.println();
    }
}
