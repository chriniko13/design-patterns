package design.patterns.examples.behavioral.chain_of_responsibility.first.core;

import design.patterns.examples.behavioral.chain_of_responsibility.first.core.domain.Error;
import design.patterns.examples.behavioral.chain_of_responsibility.first.core.domain.GeneralException;
import design.patterns.examples.behavioral.chain_of_responsibility.first.core.handler.ErrorHandler;
import design.patterns.examples.behavioral.chain_of_responsibility.first.core.handler.ExternalErrorHandler;
import design.patterns.examples.behavioral.chain_of_responsibility.first.core.handler.ProcessingErrorHandler;
import design.patterns.examples.behavioral.chain_of_responsibility.first.core.handler.ValidationErrorHandler;

import java.util.Arrays;
import java.util.List;

public class ErrorContext {

    private final List<ErrorHandler> errorHandlers;

    public ErrorContext() {
        errorHandlers = Arrays.asList(
                new ExternalErrorHandler(),
                new ProcessingErrorHandler(),
                new ValidationErrorHandler()
        );
    }

    public void handleError(Throwable error) {

        if (error instanceof GeneralException) {
            GeneralException generalException = (GeneralException) error;
            handleError(generalException.getError());
        } else {
            System.err.println("Unknown error occurred...error = " + error);
        }
    }

    public void handleError(Error error) {

        for (ErrorHandler errorHandler : errorHandlers) {
            if (errorHandler.canHandleIt(error.getErrorType())) {
                errorHandler.handle(error);
                return;
            }
        }

        System.err.println("Unknown error occurred...error = " + error);
    }
}
