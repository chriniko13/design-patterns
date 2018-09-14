package design.patterns.examples.behavioral.chain_of_responsibility.second.core;

public class EmailErrorHandler implements Receiver {

    private final Receiver nextReceiver;

    public EmailErrorHandler(Receiver nextReceiver) {
        this.nextReceiver = nextReceiver;
    }

    @Override
    public boolean process(Message message) {

        if (message.getMessage().toLowerCase().contains("email")) {
            System.out.println("Email error processed, message: " + message);
            return true;
        } else {
            if (nextReceiver != null) {
                return nextReceiver.process(message);
            }
        }

        return false;
    }
}
