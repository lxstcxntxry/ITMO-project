package com.golem.app.collection.ticket;

import com.golem.app.collection.ConsoleRead;

public class Address implements Comparable <Address>, ConsoleRead {
    /**
     * Address where to go with ticket
     * -can be null
     */
    private String street;

    /**
     * street setter
     * @param street - address street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * street getter
     * @return String
     */
    public String getStreet() {
        return street;
    }

    /**
     * default constructor. Just init object.
     */
    public Address () {}

    @Override
    public int compareTo(Address o) {
        return getStreet().compareTo(o.getStreet());
    }

    /**
     * form string to console output. Comfortable for user reading.
     * @return String
     */
    @Override
    public String toReadString() {
        return "Address >>\n" +
                "   street: " + street;
    }
}