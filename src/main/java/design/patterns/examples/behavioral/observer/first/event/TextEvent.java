package design.patterns.examples.behavioral.observer.first.event;

public class TextEvent implements Event {

    private final String message;

    public TextEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
