package design.patterns.examples.structural.facade.first.test;

import design.patterns.examples.structural.facade.first.core.RobotFacade;

public class Main {

    public static void main(String[] args) {
        RobotFacade robotFacade = new RobotFacade();
        robotFacade.createRobot("black", "steel");
    }
}
