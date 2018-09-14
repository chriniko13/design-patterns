package design.patterns.examples.behavioral.visitor.first.core;

public interface Visitor {

    void visit(TextElement textElement);

    void visit(JsonElement jsonElement);
}
