package design.patterns.examples.creational.factory_method.first.core;

public class PostgreSqlConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("Establishing connection to PostgreSql database...");
    }
}
