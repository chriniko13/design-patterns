package design.patterns.examples.structural.proxy.first.core;

public class MotorcycleEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Starting motorcycle's engine right now...");
        //Note: some real code to start the engine...
    }
}
