package design.patterns.examples.behavioral.strategy.first.provider;

import design.patterns.examples.behavioral.strategy.first.policy.SecurityPolicy;

public abstract class SecurityProvider {

    SecurityPolicy securityPolicy;

    public abstract String getIdentifier();

    public void setSecurityPolicy(SecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

}
