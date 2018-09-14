package design.patterns.examples.structural.adapter.first.core.german;

public class GermanElectricalSocket {

    public void plugin(GermanPlugConnector germanPlugConnector) {
        germanPlugConnector.provideElectricity();
    }
}
