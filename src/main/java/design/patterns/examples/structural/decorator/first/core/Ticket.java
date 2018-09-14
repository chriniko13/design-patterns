package design.patterns.examples.structural.decorator.first.core;

import java.time.ZonedDateTime;

public class Ticket {

    private final String id;
    private final String name;
    private final ZonedDateTime creationTime;

    public Ticket(String id, String name) {
        this.id = id;
        this.name = name;
        this.creationTime = ZonedDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ZonedDateTime getCreationTime() {
        return creationTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", creationTime=" + creationTime +
                '}';
    }
}
