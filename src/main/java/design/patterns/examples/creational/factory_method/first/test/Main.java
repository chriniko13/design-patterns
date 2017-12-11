package design.patterns.examples.creational.factory_method.first.test;

import design.patterns.examples.creational.factory_method.first.core.Connection;
import design.patterns.examples.creational.factory_method.first.core.ConnectionFactory;

public class Main {


    public static void main(String[] args) {


        Connection mysqlConnection = ConnectionFactory.getConnection("mysql");
        mysqlConnection.connect();

        Connection postgresqlConnection = ConnectionFactory.getConnection("postgresql");
        postgresqlConnection.connect();


        try {
            ConnectionFactory.getConnection("mongodb");
        } catch (Exception error) {
            System.err.println("ERROR --> " + error.getMessage());
        }

    }

}
