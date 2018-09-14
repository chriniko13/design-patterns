package design.patterns.examples.behavioral.chain_of_responsibility.first.core.handler;

import design.patterns.examples.behavioral.chain_of_responsibility.first.core.domain.Error;
import design.patterns.examples.behavioral.chain_of_responsibility.first.core.domain.ErrorType;

public class ProcessingErrorHandler implements ErrorHandler {

    @Override
    public boolean canHandleIt(ErrorType errorType) {
        return errorType == ErrorType.PROCESSING;
    }

    @Override
    public void handle(Error error) {
        System.err.println("Processing error occurred, will try to recover...error = " + error);
    }
}
