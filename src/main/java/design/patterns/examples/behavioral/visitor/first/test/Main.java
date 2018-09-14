package design.patterns.examples.behavioral.visitor.first.test;

import design.patterns.examples.behavioral.visitor.first.core.*;

public class Main {

    public static void main(String[] args) {

        final Element textElement = new TextElement();
        final Element jsonElement = new JsonElement();

        final Visitor infoVisitor = new InfoVisitor();

        textElement.accept(infoVisitor);
        jsonElement.accept(infoVisitor);

    }
}
