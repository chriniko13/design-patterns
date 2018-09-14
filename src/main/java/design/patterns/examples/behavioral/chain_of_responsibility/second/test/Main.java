package design.patterns.examples.behavioral.chain_of_responsibility.second.test;

import design.patterns.examples.behavioral.chain_of_responsibility.second.core.EmailErrorHandler;
import design.patterns.examples.behavioral.chain_of_responsibility.second.core.FaxErrorHandler;
import design.patterns.examples.behavioral.chain_of_responsibility.second.core.IssueRaiser;
import design.patterns.examples.behavioral.chain_of_responsibility.second.core.Message;

public class Main {

    public static void main(String[] args) {

        EmailErrorHandler emailErrorHandler = new EmailErrorHandler(null);
        FaxErrorHandler faxErrorHandler = new FaxErrorHandler(emailErrorHandler);

        IssueRaiser issueRaiser = new IssueRaiser(faxErrorHandler);

        boolean emailProblemHandled = issueRaiser.raise(new Message("could not sent email!"));
        System.out.println("emailProblemHandled: " + emailProblemHandled);

        System.out.println();

        boolean faxProblemHandled = issueRaiser.raise(new Message("could not sent fax!"));
        System.out.println("faxProblemHandled: " + faxProblemHandled);

        System.out.println();

        boolean openPcProblemHandled = issueRaiser.raise(new Message("could not open pc!"));
        System.out.println("openPcProblemHandled: " + openPcProblemHandled);

    }
}
