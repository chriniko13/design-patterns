package design.patterns.examples.structural.adapter.first.core.uk;

public class UKElectricalSocket {

    public void plugin(UKPlugConnector ukPlugConnector) {
        ukPlugConnector.giveElectricity();
    }
}
