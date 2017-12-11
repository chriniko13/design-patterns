package design.patterns.examples.behavioral.strategy.first.test;

import design.patterns.examples.behavioral.strategy.first.policy.ExtraStrongSecurityPolicy;
import design.patterns.examples.behavioral.strategy.first.policy.SecurityPolicyLevel;
import design.patterns.examples.behavioral.strategy.first.policy.StrongSecurityPolicy;
import design.patterns.examples.behavioral.strategy.first.provider.BasicSecurityProvider;
import design.patterns.examples.behavioral.strategy.first.provider.SecurityProvider;

public class Main {

    public static void main(String[] args) {

        SecurityPolicyLevel userSelectedLevel = SecurityPolicyLevel.STRONG; // Note: play with this.
        SecurityProvider securityProvider = new BasicSecurityProvider();

        if (SecurityPolicyLevel.STRONG == userSelectedLevel) {

            securityProvider.setSecurityPolicy(new StrongSecurityPolicy());

        } else if (SecurityPolicyLevel.EXTRA_STRONG == userSelectedLevel) {

            securityProvider.setSecurityPolicy(new ExtraStrongSecurityPolicy());

        } else {
            throw new IllegalStateException();
        }


        String identifier = securityProvider.getIdentifier();
        System.out.println("identifier == " + identifier);

    }

}
