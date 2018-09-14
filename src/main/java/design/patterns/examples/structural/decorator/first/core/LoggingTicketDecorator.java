package design.patterns.examples.structural.decorator.first.core;

public class LoggingTicketDecorator extends TicketDecorator {

    public LoggingTicketDecorator(TicketService ticketService) {
        super(ticketService);
    }

    @Override
    public Ticket orderTicket(String name) {
        System.out.println(getClass().getSimpleName() + "#orderTicket ---> BEFORE");
        Ticket ticket = super.orderTicket(name);
        System.out.println(getClass().getSimpleName() + "#orderTicket ---> AFTER");
        return ticket;
    }
}
