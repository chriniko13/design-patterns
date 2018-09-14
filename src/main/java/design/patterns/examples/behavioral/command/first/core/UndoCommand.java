package design.patterns.examples.behavioral.command.first.core;

import java.time.ZonedDateTime;

public class UndoCommand implements Command {

    private final Receiver receiver;

    public UndoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.performUndo();
    }

    @Override
    public String info() {
        return "undo-command, time: " + ZonedDateTime.now();
    }
}
