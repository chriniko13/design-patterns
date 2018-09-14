package design.patterns.examples.behavioral.memento.first.test;

import design.patterns.examples.behavioral.memento.first.core.Caretaker;
import design.patterns.examples.behavioral.memento.first.core.FileWriter;

public class Main {

    public static void main(String[] args) {

        // Important Concepts: (Originator, Memento), Caretaker

        final Caretaker caretaker = new Caretaker();
        final FileWriter fileWriter = new FileWriter("info.txt");

        fileWriter.write("yolo ");
        fileWriter.write("driven ");
        fileWriter.write("development");

        System.out.println(fileWriter.toString());

        caretaker.save(fileWriter); // savepoint.

        fileWriter.write(" some random data here ");
        fileWriter.write("and there...");

        System.out.println(fileWriter.toString());

        caretaker.undo(fileWriter); // rollback to last savepoint.

        System.out.println(fileWriter.toString());

    }
}
