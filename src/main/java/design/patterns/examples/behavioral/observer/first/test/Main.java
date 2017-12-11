package design.patterns.examples.behavioral.observer.first.test;

import design.patterns.examples.behavioral.observer.first.event.Event;
import design.patterns.examples.behavioral.observer.first.event.TextEvent;
import design.patterns.examples.behavioral.observer.first.event.TicketIdEvent;
import design.patterns.examples.behavioral.observer.first.observer.Observer;
import design.patterns.examples.behavioral.observer.first.observer.ObserverImpl;
import design.patterns.examples.behavioral.observer.first.subject.Subject;
import design.patterns.examples.behavioral.observer.first.subject.SubjectImpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

    public static void main(String[] args) {

        System.out.println("------BASIC OBSERVER PATTERN DEMONSTRATION------\n");

        final Queue<Event> eventsQueue = new ConcurrentLinkedQueue<>();

        Observer observer1 = new ObserverImpl("observer1",
                event -> {
                    eventsQueue.add(event);
                    System.out.println("observer1 --- event message: " + event.getMessage());
                },
                Collections.singletonList(TextEvent.class)
        );

        Observer observer2 = new ObserverImpl("observer2",
                event -> {
                    eventsQueue.add(event);
                    System.out.println("observer2 --- event message: " + event.getMessage());
                },
                Collections.singletonList(TicketIdEvent.class)
        );

        Observer observer3 = new ObserverImpl("observer3",
                event -> {
                    eventsQueue.add(event);
                    System.out.println("observer3 --- event message: " + event.getMessage());
                },
                Arrays.asList(TextEvent.class, TicketIdEvent.class)
        );

        Observer observer4 = new ObserverImpl("observer4",
                event -> {
                    eventsQueue.add(event);
                    System.out.println("observer4 --- event message: " + event.getMessage());
                },
                Arrays.asList(TextEvent.class, TicketIdEvent.class)
        );

        Subject subject1 = new SubjectImpl();
        subject1.register(observer1);
        subject1.register(observer2);
        subject1.register(observer3);
        subject1.register(observer4);
        subject1.unregister(observer4);


        subject1.notifyObservers(new TextEvent("chriniko was here!"));
        subject1.notifyObservers(new TicketIdEvent());


        System.out.println("---PRINT EVENTS WITH FIFO ORDER---");
        while (!eventsQueue.isEmpty()) {
            Event event = eventsQueue.poll();
            System.out.println("--- event message: " + event.getMessage() + ", event class: " + event.getClass());
        }
    }
}
