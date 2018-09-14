package design.patterns.examples.behavioral.interpreter.first.test;

import design.patterns.examples.behavioral.interpreter.first.core.ExpressionParser;

public class Main {

    public static void main(String[] args) {

        ExpressionParser expressionParser = new ExpressionParser();

        // postfix notation.
        int result = expressionParser.parse("2 1 5 + *");

        System.out.println(result);
    }
}
