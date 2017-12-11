package design.patterns.examples.creational.singleton.second.core;

import java.io.Serializable;

public class MySingleton implements Serializable {

    private static MySingleton INSTANCE;

    // Note: safe publication ensured.
    static {
        INSTANCE = new MySingleton();
    }

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        return INSTANCE;
    }

    public String getIdentity() {
        return "identity: " + toString();
    }
}
