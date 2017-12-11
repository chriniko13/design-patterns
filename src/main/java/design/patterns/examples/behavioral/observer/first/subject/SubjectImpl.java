package design.patterns.examples.behavioral.observer.first.subject;

import design.patterns.examples.behavioral.observer.first.event.Event;
import design.patterns.examples.behavioral.observer.first.observer.Observer;

import java.util.LinkedList;
import java.util.List;

public class SubjectImpl implements Subject {

    private final List<Observer> observers;

    public SubjectImpl() {
        this.observers = new LinkedList<>();
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(final Event event) {

        for (Observer observer : observers) {
            observer.update(event);
        }

    }
}
