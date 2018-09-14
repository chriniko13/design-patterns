package design.patterns.examples.behavioral.command.first.core;

public class Receiver {

    void performUndo() {
        System.out.println("Performing undo operation...");
    }

    void performRedo() {
        System.out.println("Performing redo operation...");
    }
}
