package design.patterns.examples.behavioral.chain_of_responsibility.first.core.domain;

public class Error {

    private final String message;
    private final ErrorType errorType;

    public Error(String message, ErrorType errorType) {
        this.message = message;
        this.errorType = errorType;
    }

    public String getMessage() {
        return message;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    @Override
    public String toString() {
        return "Error{" +
                "message='" + message + '\'' +
                ", errorType=" + errorType +
                '}';
    }
}
