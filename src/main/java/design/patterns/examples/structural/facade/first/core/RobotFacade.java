package design.patterns.examples.structural.facade.first.core;

public class RobotFacade {

    private final RobotBody robotBody;
    private final RobotColor robotColor;
    private final RobotMetal robotMetal;

    public RobotFacade() {
        robotBody = new RobotBody();
        robotColor = new RobotColor();
        robotMetal = new RobotMetal();
    }

    public void createRobot(String color, String metal) {
        System.out.println("starting robot creation...");
        robotBody.createBody();
        robotColor.setColor(color);
        robotMetal.setMetal(metal);
        System.out.println("robot creation ended...");
    }
}
