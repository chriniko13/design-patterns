package design.patterns.examples.behavioral.template.first.core;

public class LocalTransactionTemplate extends TransactionTemplate {

    @Override
    void apply() {
        System.out.println(this.getClass().getSimpleName() + "#" + Thread.currentThread().getName() + " --- performing necessary calculations...");
    }
}
