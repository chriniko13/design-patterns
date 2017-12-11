package design.patterns.examples.behavioral.template.first.core;

public abstract class TransactionTemplate {

    private void beginTransaction() {
        System.out.println(this.getClass().getSimpleName() + "#" + Thread.currentThread().getName() + " --- transaction initialized...");
    }

    private void endTransaction() {
        System.out.println(this.getClass().getSimpleName() + "#" + Thread.currentThread().getName() + " --- transaction terminated...");
    }

    public void doTransaction() {

        try {
            beginTransaction();

            apply();

        } finally {
            endTransaction();
        }
    }

    abstract void apply();

}
