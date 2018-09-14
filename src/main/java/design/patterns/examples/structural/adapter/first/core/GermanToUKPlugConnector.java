package design.patterns.examples.structural.adapter.first.core;

import design.patterns.examples.structural.adapter.first.core.german.GermanPlugConnector;
import design.patterns.examples.structural.adapter.first.core.uk.UKPlugConnector;

public class GermanToUKPlugConnector implements UKPlugConnector {

    private final GermanPlugConnector germanPlugConnector;

    public GermanToUKPlugConnector(GermanPlugConnector germanPlugConnector) {
        this.germanPlugConnector = germanPlugConnector;
    }

    @Override
    public void giveElectricity() {
        // Note: do your necessary transformation/adaptations.
        germanPlugConnector.provideElectricity();
    }
}
