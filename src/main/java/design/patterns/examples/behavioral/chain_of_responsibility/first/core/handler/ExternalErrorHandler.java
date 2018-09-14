package design.patterns.examples.behavioral.chain_of_responsibility.first.core.handler;

import design.patterns.examples.behavioral.chain_of_responsibility.first.core.domain.Error;
import design.patterns.examples.behavioral.chain_of_responsibility.first.core.domain.ErrorType;

public class ExternalErrorHandler implements ErrorHandler {

    @Override
    public boolean canHandleIt(ErrorType errorType) {
        return errorType == ErrorType.EXTERNAL;
    }

    @Override
    public void handle(Error error) {
        System.err.println("External error occurred, will try to recover...error = " + error);
    }
}
