package design.patterns.examples.behavioral.template.first.core;

public class DistributedTransactionTemplate extends TransactionTemplate {

    @Override
    void apply() {
        System.out.println(this.getClass().getSimpleName() + "#" + Thread.currentThread().getName() + " --- initializing communication with external system...");
        System.out.println(this.getClass().getSimpleName() + "#" + Thread.currentThread().getName() + " --- performing necessary calculations...");
        System.out.println(this.getClass().getSimpleName() + "#" + Thread.currentThread().getName() + " --- commit changes...");
        System.out.println(this.getClass().getSimpleName() + "#" + Thread.currentThread().getName() + " --- commit changes to external system...");
        System.out.println(this.getClass().getSimpleName() + "#" + Thread.currentThread().getName() + " --- verify changes applied to external system...");
        System.out.println(this.getClass().getSimpleName() + "#" + Thread.currentThread().getName() + " --- store calculations...");


    }
}
