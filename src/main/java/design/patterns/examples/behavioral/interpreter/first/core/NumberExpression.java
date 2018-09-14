package design.patterns.examples.behavioral.interpreter.first.core;

public class NumberExpression implements Expression {

    private final int num;

    public NumberExpression(int num) {
        this.num = num;
    }

    public NumberExpression(String num) {
        this.num = Integer.parseInt(num);
    }

    @Override
    public int interpret() {
        return num;
    }
}
