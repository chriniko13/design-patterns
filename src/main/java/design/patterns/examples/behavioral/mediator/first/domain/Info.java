package design.patterns.examples.behavioral.mediator.first.domain;

import design.patterns.examples.behavioral.mediator.first.core.Mediator;

public class Info {

    private final Mediator<String> mediator;
    private final String name;

    public Info(Mediator<String> mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void display(String message) {
        System.out.println("{" + name + " - incoming}= " + message);
    }

    public void publish(String message) {
        mediator.send("[from name=" + name + "]" + message);
    }

}
