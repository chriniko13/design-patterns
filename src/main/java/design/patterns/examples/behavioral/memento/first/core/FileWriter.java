package design.patterns.examples.behavioral.memento.first.core;

// Originator.
public class FileWriter {

    private String name;
    private StringBuilder content;

    public FileWriter(String name) {
        this.name = name;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return content.toString();
    }

    public void write(String datum) {
        content.append(datum);
    }

    Memento save() {
        return new Memento(this.name, this.content);
    }

    void undoToLastSave(Object o) {
        Memento memento = (Memento) o;
        this.name = memento.name;
        this.content = memento.content;
    }

    // Memento.
    private class Memento {

        private final String name;
        private final StringBuilder content;

        private Memento(String name, StringBuilder content) {
            this.name = name;
            this.content = new StringBuilder(content);
        }
    }


}
