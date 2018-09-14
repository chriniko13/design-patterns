package design.patterns.examples.structural.decorator.first.core;

public class CarRentalTicketDecorator extends TicketDecorator {

    public CarRentalTicketDecorator(TicketService ticketService) {
        super(ticketService);
    }

    @Override
    public Ticket orderTicket(String name) {
        Ticket ticket = super.orderTicket(name);

        System.out.println("Will rent a car for ticket: " + ticket);

        return ticket;
    }
}
