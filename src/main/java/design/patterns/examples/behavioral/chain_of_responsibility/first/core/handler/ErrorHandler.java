package design.patterns.examples.behavioral.chain_of_responsibility.first.core.handler;

import design.patterns.examples.behavioral.chain_of_responsibility.first.core.domain.Error;
import design.patterns.examples.behavioral.chain_of_responsibility.first.core.domain.ErrorType;

public interface ErrorHandler {

    boolean canHandleIt(ErrorType errorType);

    void handle(Error error);
}
