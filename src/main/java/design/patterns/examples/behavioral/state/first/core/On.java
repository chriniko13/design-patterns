package design.patterns.examples.behavioral.state.first.core;

public class On implements RemoteControl {

    @Override
    public void change(TV tv) {
        System.out.println("It was on...switching to off state...");
        tv.setState(new Off());
    }
}
