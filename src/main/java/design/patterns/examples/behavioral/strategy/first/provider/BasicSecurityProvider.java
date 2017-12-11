package design.patterns.examples.behavioral.strategy.first.provider;

public class BasicSecurityProvider extends SecurityProvider {

    @Override
    public String getIdentifier() {
        return securityPolicy.getToken();
    }
}
