package design.patterns.examples.behavioral.command.first.test;

import design.patterns.examples.behavioral.command.first.core.Invoker;
import design.patterns.examples.behavioral.command.first.core.Receiver;
import design.patterns.examples.behavioral.command.first.core.RedoCommand;
import design.patterns.examples.behavioral.command.first.core.UndoCommand;

public class Main {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        // Client holds Invoker and Command objects.

        Invoker invoker = new Invoker();
        invoker.invoke(new RedoCommand(receiver));
        invoker.invoke(new UndoCommand(receiver));

        invoker.getCommandsHistory().forEach(commandExecuted -> {
            System.out.println("command executed: " + commandExecuted.info());
        });
    }
}
