package design.patterns.examples.behavioral.state.first.test;

import design.patterns.examples.behavioral.state.first.core.Off;
import design.patterns.examples.behavioral.state.first.core.TV;

public class Main {

    public static void main(String[] args) {

        TV tv = new TV(new Off());

        tv.pressSwitch();
        tv.pressSwitch();
    }
}
