package design.patterns.examples.behavioral.observer.first.event;

import java.util.UUID;

public class TicketIdEvent implements Event {

    @Override
    public String getMessage() {
        return UUID.randomUUID().toString();
    }
}
