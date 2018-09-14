package design.patterns.examples.behavioral.state.first.core;

public class Off implements RemoteControl {

    @Override
    public void change(TV tv) {
        System.out.println("It was off...switching to on state...");
        tv.setState(new On());
    }
}
