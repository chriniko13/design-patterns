package design.patterns.examples.structural.proxy.first.core;

public class EngineChecker implements Engine {

    private Engine engine;

    @Override
    public void start() {

        System.out.println("Checking vital components...");
        // Note: some real code here to check vital components of engine...

        sleep();

        //Lazy initialization
        if (engine == null) {
            engine = new MotorcycleEngine();
        }
        engine.start();
    }

    private void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.err);
        }
    }
}
