package design.patterns.examples.behavioral.template.first.test;

import design.patterns.examples.behavioral.template.first.core.DistributedTransactionTemplate;
import design.patterns.examples.behavioral.template.first.core.LocalTransactionTemplate;
import design.patterns.examples.behavioral.template.first.core.TransactionTemplate;

public class Main {

    public static void main(String[] args) {
        System.out.println("------BASIC TEMPLATE PATTERN DEMONSTRATION------\n");

        TransactionTemplate localTransactionTemplate = new LocalTransactionTemplate();
        localTransactionTemplate.doTransaction();

        System.out.println();

        TransactionTemplate distributedTransactionTemplate = new DistributedTransactionTemplate();
        distributedTransactionTemplate.doTransaction();
    }
}
