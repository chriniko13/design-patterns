package design.patterns.examples.structural.decorator.first.core;

import java.util.*;

public class TicketServiceImpl implements TicketService {

    private Map<String, List<Ticket>> ticketsDb = new HashMap<>();

    @Override
    public Ticket orderTicket(String name) {

        final Ticket ticket = new Ticket(UUID.randomUUID().toString(), name);

        ticketsDb.computeIfAbsent(
                name,
                ticketName -> {
                    final List<Ticket> tickets = new LinkedList<>();
                    tickets.add(ticket);
                    ticketsDb.put(ticketName, tickets);
                    return tickets;
                }
        );

        ticketsDb.computeIfPresent(
                name,
                (ticketName, tickets) -> {
                    tickets.add(ticket);
                    return tickets;
                }
        );

        return ticket;
    }
}
