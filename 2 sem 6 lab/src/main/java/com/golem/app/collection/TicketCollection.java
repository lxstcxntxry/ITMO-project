package com.golem.app.collection;

import com.golem.app.collection.ticket.Ticket;
import java.time.LocalDate;
import java.util.LinkedHashMap;

public class TicketCollection implements ConsoleRead{
    private LocalDate creationDate;
    private LinkedHashMap<String, Ticket> collection = new LinkedHashMap<>();

    public void setCollection (LinkedHashMap<String, Ticket> collection) {
        this.collection = collection;
    }

    public LinkedHashMap<String, Ticket> getCollection() {
        return collection;
    }

    public String toReadString() {
        return  "Collection:\n" +
                "   Create date: " + //creationDate.toString() + "\n" +
                "   Collection type: " + collection.getClass().getSimpleName() + "\n"+
                "   Object amount: " + collection.size() + "\n";
    }
}
