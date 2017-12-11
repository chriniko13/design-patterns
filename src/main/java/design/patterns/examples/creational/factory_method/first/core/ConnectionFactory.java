package design.patterns.examples.creational.factory_method.first.core;

public class ConnectionFactory {

    public static Connection getConnection(String dbName) {

        switch (dbName) {

            case "MYSQL":
            case "mysql":
                return new MySqlConnection();

            case "POSTGRESQL":
            case "postgresql":
                return new PostgreSqlConnection();


            default:
                throw new IllegalStateException("Provided dbName is not supported.");
        }


    }
}
