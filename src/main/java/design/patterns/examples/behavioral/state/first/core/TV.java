package design.patterns.examples.behavioral.state.first.core;

public class TV {

    private RemoteControl state;

    public TV(RemoteControl remoteControl) {
        this.state = remoteControl;
    }

    public void pressSwitch() {
        state.change(this);
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }
}
