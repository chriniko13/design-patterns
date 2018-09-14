package design.patterns.examples.behavioral.chain_of_responsibility.second.core;

public class IssueRaiser {

    private final Receiver firstReceiver;

    public IssueRaiser(Receiver firstReceiver) {
        this.firstReceiver = firstReceiver;
    }

    public boolean raise(Message message) {
        if (firstReceiver != null) {
            return firstReceiver.process(message);
        }
        return false;
    }
}
