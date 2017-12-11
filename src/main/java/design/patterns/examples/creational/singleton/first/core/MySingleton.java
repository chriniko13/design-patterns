package design.patterns.examples.creational.singleton.first.core;

public class MySingleton {

    private static MySingleton INSTANCE;

    private MySingleton() {
    }

    public synchronized static MySingleton getInstance() { // Note: play with synchronized here, add it or remove it and see what happens.

        if (INSTANCE == null) {
            INSTANCE = new MySingleton();
        }

        return INSTANCE;
    }

    public static MySingleton getInstance_SecondWay() {

        synchronized (MySingleton.class) { // Note: comment-uncomment synchronized block and see what happens...
            if (INSTANCE == null) {
                INSTANCE = new MySingleton();
            }

            return INSTANCE;
        }

    }

    public String getIdentity() {
        return "identity: " + toString();
    }
}
