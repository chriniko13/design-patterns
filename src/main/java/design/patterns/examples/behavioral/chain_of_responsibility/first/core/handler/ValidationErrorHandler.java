package design.patterns.examples.behavioral.chain_of_responsibility.first.core.handler;

import design.patterns.examples.behavioral.chain_of_responsibility.first.core.domain.Error;
import design.patterns.examples.behavioral.chain_of_responsibility.first.core.domain.ErrorType;

public class ValidationErrorHandler implements ErrorHandler {

    @Override
    public boolean canHandleIt(ErrorType errorType) {
        return errorType == ErrorType.VALIDATION;
    }

    @Override
    public void handle(Error error) {
        System.err.println("Validation error occurred, will try to recover...error = " + error);
    }
}
