package design.patterns.examples.behavioral.command.first.core;

import java.util.LinkedList;
import java.util.List;

public class Invoker {

    private final List<Command> commandsHistory = new LinkedList<>();

    public void invoke(Command command) {
        commandsHistory.add(command);
        command.execute();
    }

    public List<Command> getCommandsHistory() {
        return commandsHistory;
    }
}
