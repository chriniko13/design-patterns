package design.patterns.examples.behavioral.interpreter.first.core;

public class AdditionExpression implements Expression {

    private final Expression first;
    private final Expression second;

    public AdditionExpression(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int interpret() {
        return first.interpret() + second.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}