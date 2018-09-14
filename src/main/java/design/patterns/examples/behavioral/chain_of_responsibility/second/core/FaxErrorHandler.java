package design.patterns.examples.behavioral.chain_of_responsibility.second.core;

public class FaxErrorHandler implements Receiver {

    private final Receiver nextReceiver;

    public FaxErrorHandler(Receiver nextReceiver) {
        this.nextReceiver = nextReceiver;
    }

    @Override
    public boolean process(Message message) {

        if (message.getMessage().toLowerCase().contains("fax")) {
            System.out.println("Fax error processed, message: " + message);
            return true;
        } else {
            if (nextReceiver != null) {
                return nextReceiver.process(message);
            }
        }

        return false;
    }
}
