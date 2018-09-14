package design.patterns.examples.behavioral.interpreter.first.core;

import java.util.Stack;

public class ExpressionParser {

    public int parse(String expression) {

        final Stack<Expression> expressionsStack = new Stack<>();
        final String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (Parsers.isOperator(token)) {

                Expression firstElement = expressionsStack.pop();
                Expression secondElement = expressionsStack.pop();
                Expression expressionToEvaluate = Parsers.getExpressionObject(firstElement, secondElement, token);

                int evaluatedExpression = expressionToEvaluate.interpret();
                NumberExpression numberExpression = new NumberExpression(evaluatedExpression);

                expressionsStack.push(numberExpression);

            } else {
                expressionsStack.push(new NumberExpression(token));
            }
        }
        return expressionsStack.pop().interpret();
    }
}
