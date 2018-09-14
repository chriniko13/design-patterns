package design.patterns.examples.structural.decorator.first.test;

import design.patterns.examples.structural.decorator.first.core.*;

public class Main {

    public static void main(String[] args) {

        TicketService ticketService = new TicketServiceImpl();

        // 1: LoggingTicketDecorator ---> TicketServiceImpl
        TicketDecorator loggingTicketDecorator = new LoggingTicketDecorator(ticketService);

        Ticket ticket = loggingTicketDecorator.orderTicket("trip to europe");

        System.out.println("ticket = " + ticket);

        // 2: CarRentalTicketDecorator ---> LoggingTicketDecorator ---> TicketServiceImpl
        System.out.println("\n");

        TicketDecorator carRentalTicketDecorator = new CarRentalTicketDecorator(loggingTicketDecorator);

        Ticket ticket2 = carRentalTicketDecorator.orderTicket("trip to america");

        System.out.println("ticket2 = " + ticket2);
    }
}
