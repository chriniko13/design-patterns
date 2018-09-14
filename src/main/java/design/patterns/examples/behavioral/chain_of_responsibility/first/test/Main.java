package design.patterns.examples.behavioral.chain_of_responsibility.first.test;

import design.patterns.examples.behavioral.chain_of_responsibility.first.core.ErrorContext;
import design.patterns.examples.behavioral.chain_of_responsibility.first.core.domain.Error;
import design.patterns.examples.behavioral.chain_of_responsibility.first.core.domain.ErrorType;
import design.patterns.examples.behavioral.chain_of_responsibility.first.core.domain.GeneralException;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) throws Exception {


        // --- 1st example usage ---
        final ErrorContext errorContext = new ErrorContext();

        errorContext.handleError(new Error("could not connect to IGT", ErrorType.EXTERNAL));
        errorContext.handleError(new Error("wrong request data", ErrorType.VALIDATION));
        errorContext.handleError(new Error("could not ping harvest worker", ErrorType.PROCESSING));
        errorContext.handleError(new Error("unknown", null));


        // --- 2nd example usage ---

        final CountDownLatch countDownLatch = new CountDownLatch(1);

        Thread.setDefaultUncaughtExceptionHandler((thread, error) -> {
            errorContext.handleError(error);
            countDownLatch.countDown();
        });

        Runnable workToDo = () -> {

            System.out.println("worker here will start work...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ignored) {
            }
            throw new GeneralException(new Error("worker died", ErrorType.PROCESSING));

        };
        Thread worker = new Thread(workToDo);
        worker.start();

        countDownLatch.await();
    }
}
