package design.patterns.examples.behavioral.memento.first.core;

// Caretaker.
public class Caretaker {

    private Object storedState;

    public void save(FileWriter fileWriter) {
        storedState = fileWriter.save();
    }

    public void undo(FileWriter fileWriter) {
        fileWriter.undoToLastSave(storedState);
    }
}
