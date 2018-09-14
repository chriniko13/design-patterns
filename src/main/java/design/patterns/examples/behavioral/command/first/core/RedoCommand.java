package design.patterns.examples.behavioral.command.first.core;

import java.time.ZonedDateTime;

public class RedoCommand implements Command {

    private final Receiver receiver;

    public RedoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.performRedo();
    }

    @Override
    public String info() {
        return "redo-command, time: " + ZonedDateTime.now();
    }
}
