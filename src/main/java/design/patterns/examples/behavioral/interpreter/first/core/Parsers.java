package design.patterns.examples.behavioral.interpreter.first.core;

class Parsers {

    static boolean isOperator(String symbol) {
        return symbol.equals("+")
                || symbol.equals("-")
                || symbol.equals("*")
                || symbol.equals("/");
    }

    static Expression getExpressionObject(Expression firstExpression, Expression secondExpression, String symbol) {
        switch (symbol) {
            case "+":
                return new AdditionExpression(firstExpression, secondExpression);
            case "-":
                return new SubtractionExpression(firstExpression, secondExpression);
            case "*":
                return new MultiplicationExpression(firstExpression, secondExpression);
            case "/":
                return new DivisionExpression(firstExpression, secondExpression);
            default:
                throw new IllegalStateException();
        }
    }

}
