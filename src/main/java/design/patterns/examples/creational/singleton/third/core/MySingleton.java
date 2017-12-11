package design.patterns.examples.creational.singleton.third.core;

public enum MySingleton {

    INSTANCE;

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
