package com.golem.app.commandSystem.commandsCollection.miniCommands;

import com.golem.app.collection.TicketCollection;
import com.golem.app.collection.ticket.Ticket;
import com.golem.app.fileSystem.ConsolePrinter;

import java.util.LinkedHashMap;

public class DuplicateUnload {
    public static void dupUnload (TicketCollection collection) {
        LinkedHashMap<String, Ticket> col = new LinkedHashMap<>();
        boolean check = false;
        System.out.println(collection.getCollection().size());
        for (String s : collection.getCollection().keySet()) {
            for (String ss : col.keySet()) {
                if (collection.getCollection().get(s).getId() == col.get(ss).getId()){
                    ConsolePrinter.out("Duplicate for id <<" + collection.getCollection().get(s).getId() + ">> was unloaded");
                    check = true;
                }
            }
            if (!check) {
                col.put(s, collection.getCollection().get(s));
            }
            check = false;
        }
        collection.setCollection(col);
    }
}
