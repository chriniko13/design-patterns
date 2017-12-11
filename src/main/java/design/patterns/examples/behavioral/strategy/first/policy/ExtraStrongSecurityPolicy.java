package design.patterns.examples.behavioral.strategy.first.policy;

import java.util.UUID;

public class ExtraStrongSecurityPolicy implements SecurityPolicy {

    @Override
    public String getToken() {
        return UUID.randomUUID().toString();
    }
}
