package design.patterns.examples.behavioral.observer.first.subject;

import design.patterns.examples.behavioral.observer.first.event.Event;
import design.patterns.examples.behavioral.observer.first.observer.Observer;

public interface Subject {

    void register(Observer subject);

    void unregister(Observer subject);

    void notifyObservers(Event event);

}
