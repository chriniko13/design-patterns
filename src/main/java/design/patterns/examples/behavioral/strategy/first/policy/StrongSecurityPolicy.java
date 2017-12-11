package design.patterns.examples.behavioral.strategy.first.policy;

import java.security.SecureRandom;

public class StrongSecurityPolicy implements SecurityPolicy {

    private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static SecureRandom RND = new SecureRandom();

    private static String randomString(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(RND.nextInt(AB.length())));
        return sb.toString();
    }

    @Override
    public String getToken() {
        return randomString(45);
    }
}
