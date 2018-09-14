package design.patterns.examples.structural.adapter.first.test;

import design.patterns.examples.structural.adapter.first.core.GermanToUKPlugConnector;
import design.patterns.examples.structural.adapter.first.core.german.GermanPlugConnector;
import design.patterns.examples.structural.adapter.first.core.uk.UKElectricalSocket;

public class Main {

    public static void main(String[] args) {

        GermanPlugConnector germanPlugConnector = new GermanPlugConnector() {
            @Override
            public void provideElectricity() {
                System.out.println("this is a german plug connector which will provide electricity to your device...");
            }
        };

        UKElectricalSocket ukElectricalSocket = new UKElectricalSocket();

        //ukElectricalSocket.plugin(germanPlugConnector); // Note: WE CANT!

        GermanToUKPlugConnector germanToUKPlugConnector = new GermanToUKPlugConnector(germanPlugConnector);

        ukElectricalSocket.plugin(germanToUKPlugConnector); // Note: but now WE CAN!
    }
}
