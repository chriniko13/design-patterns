package design.patterns.examples.behavioral.observer.first.observer;

import design.patterns.examples.behavioral.observer.first.event.Event;

import java.util.List;
import java.util.function.Consumer;

public class ObserverImpl implements Observer {

    private final String name;
    private final Consumer<Event> action;
    private final List<Class<? extends Event>> listensOn;

    public ObserverImpl(String name, Consumer<Event> action, List<Class<? extends Event>> listensOn) {
        this.name = name;
        this.action = action;
        this.listensOn = listensOn;
    }

    @Override
    public void update(Event event) {

        if (listensOn().contains(event.getClass())) {
            action.accept(event);
        } else {
            System.out.println(name
                    + " --- received a ignored event, event class: "
                    + event.getClass()
                    + ", event message: "
                    + event.getMessage()
                    + " --- listensOn: " + listensOn);
        }

        System.out.println();
    }

    @Override
    public List<Class<? extends Event>> listensOn() {
        return listensOn;
    }

    @Override
    public String getName() {
        return name;
    }
}
