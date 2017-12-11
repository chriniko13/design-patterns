package design.patterns.examples.behavioral.iterator.first.test;

import design.patterns.examples.behavioral.iterator.first.core.Iterator;
import design.patterns.examples.behavioral.iterator.first.core.Subject;
import design.patterns.examples.behavioral.iterator.first.core.SubjectImpl;
import design.patterns.examples.behavioral.iterator.first.core.SubjectListImpl;

public class Main {

    public static void main(String[] args) {

        System.out.println("------BASIC ITERATOR PATTERN DEMONSTRATION------\n");

        Subject<String> subject = new SubjectImpl();

        Iterator<String> iterator = subject.getIterator();

        while (!iterator.isDone()) {
            System.out.println("iterator elem: " + iterator.next());
        }

        System.out.println();

        System.out.println("iterator first = " + iterator.first());
        System.out.println("iterator last = " + iterator.last());

        System.out.println();

        iterator.reset();
        iterator.next();
        iterator.next();

        System.out.println("iterator current = " + iterator.current());
        System.out.println("iterator current = " + iterator.current());


        System.out.println("\n--------2nd example--------\n");

        Subject<String> subjectList = new SubjectListImpl();

        Iterator<String> subjectListIterator = subjectList.getIterator();

        while (!subjectListIterator.isDone()) {
            System.out.println("iterator elem: " + subjectListIterator.next());
        }

        System.out.println();

        System.out.println("iterator first = " + subjectListIterator.first());
        System.out.println("iterator last = " + subjectListIterator.last());

        System.out.println();

        subjectListIterator.reset();
        subjectListIterator.next();
        subjectListIterator.next();

        System.out.println("iterator current = " + subjectListIterator.current());
        System.out.println("iterator current = " + subjectListIterator.current());

    }
}
