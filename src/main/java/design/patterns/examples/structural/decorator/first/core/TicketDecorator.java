package design.patterns.examples.structural.decorator.first.core;

public abstract class TicketDecorator implements TicketService {

    private final TicketService ticketService;

    public TicketDecorator(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @Override
    public Ticket orderTicket(String name) {
        return ticketService.orderTicket(name);
    }
}
