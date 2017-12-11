package design.patterns.examples.creational.singleton.first.test;

import design.patterns.examples.creational.singleton.first.core.MySingleton;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {

        firstExample();

        System.out.println();

        secondExample();
    }

    private static void firstExample() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List<Future<?>> results = new LinkedList<>();

        //dispatch work to workers...
        for (int i = 0; i < 5; i++) {

            Runnable work = () -> {
                MySingleton mySingleton = MySingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + " --- " + mySingleton.getIdentity());
            };

            Future<?> result = executorService.submit(work);
            results.add(result);
        }

        //block until all workers finish the job...
        results.forEach(r -> {
            try {
                r.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace(System.err);
            }
        });

        executorService.shutdownNow();
    }

    private static void secondExample() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List<Future<?>> results = new LinkedList<>();

        //dispatch work to workers...
        for (int i = 0; i < 5; i++) {

            Runnable work = () -> {
                MySingleton mySingleton = MySingleton.getInstance_SecondWay();
                System.out.println(Thread.currentThread().getName() + " --- " + mySingleton.getIdentity());
            };

            Future<?> result = executorService.submit(work);
            results.add(result);
        }

        //block until all workers finish the job...
        results.forEach(r -> {
            try {
                r.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace(System.err);
            }
        });

        executorService.shutdownNow();
    }
}
