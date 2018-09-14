package design.patterns.examples.behavioral.visitor.first.core;

public class TextElement implements Element {

    private final String text;

    public TextElement() {
        text = "some text goes here";
    }

    String getText() {
        return text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Note: double dispatch.
    }
}
