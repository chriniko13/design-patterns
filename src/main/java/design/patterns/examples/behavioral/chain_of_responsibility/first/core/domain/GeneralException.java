package design.patterns.examples.behavioral.chain_of_responsibility.first.core.domain;

public class GeneralException extends RuntimeException {

    private final Error error;

    public GeneralException(Error error) {
        this.error = error;
    }

    public Error getError() {
        return error;
    }
}
