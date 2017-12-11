package design.patterns.examples.behavioral.observer.first.observer;

import design.patterns.examples.behavioral.observer.first.event.Event;

import java.util.List;

public interface Observer {

    void update(Event event);

    List<Class<? extends Event>> listensOn();

    String getName();
}
