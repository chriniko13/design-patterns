package design.patterns.examples.creational.factory_method.first.core;

public class MySqlConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("Establishing connection to MySQL database...");
    }
}
