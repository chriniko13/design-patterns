package design.patterns.examples.behavioral.interpreter.first.core;

public class SubtractionExpression implements Expression {

    private final Expression first;
    private final Expression second;

    public SubtractionExpression(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int interpret() {
        return first.interpret() - second.interpret();
    }

    @Override
    public String toString() {
        return "-";
    }
}