package com.golem.app.collection.ticket;

import com.golem.app.collection.ConsoleRead;

public class Venue implements Comparable<Venue>, ConsoleRead {
    /**
     * Значение поля должно быть больше 0,
     * Значение этого поля должно быть уникальным,
     * Значение этого поля должно генерироваться автоматически
     */
    private Integer id;

    /**
     * Поле не может быть null,
     * Строка не может быть пустой
     */
    private String name;

    /**
     * Значение поля должно быть больше 0
     */
    private Long capacity;

    /**
     * Поле может быть null
     */
    private VenueType type;

    /**
     * Поле может быть null
     */
    private Address address;

    public Venue () {}

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }
    public Long getCapacity() {
        return capacity;
    }
    public void setType(VenueType type) {
        this.type = type;
    }
    public VenueType getType() {
        return type;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }

    @Override
    public int compareTo(Venue o) {
        int compare;
        if (o == null) return 1;
        if ((compare = getName().compareTo(o.getName())) != 0) return compare;
        if ((compare = getCapacity().compareTo(o.getCapacity())) != 0) return compare;
        if ((compare = getAddress().compareTo(o.getAddress())) != 0) return compare;
        if ((compare = getType().compareTo(o.getType())) != 0) return compare;
        return getId().compareTo(o.getId());
    }

    @Override
    public String toReadString() {
        String addressTemp;
        if (address != null) {
            addressTemp = address.toReadString();
        }
        else {
            addressTemp = "";
        }
        return "Venue >>\n" +
                "   name: " + name + "\n"+
                "   capacity: " + capacity + "\n"+
                "   type: " + type + "\n"+
                addressTemp;
    }

    public enum VenueType {
        BAR,
        LOFT,
        OPEN_AREA,
        THEATRE,
        MALL
    }



}