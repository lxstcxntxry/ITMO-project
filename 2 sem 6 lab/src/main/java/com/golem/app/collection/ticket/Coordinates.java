package com.golem.app.collection.ticket;

import com.golem.app.collection.ConsoleRead;

public class Coordinates implements Comparable <Coordinates>, ConsoleRead {
    /**
     * Поле не может быть null
     */
    private Long x;

    /**
     * Максимальное значение поля: 990, Поле не может быть null
     */
    private Long y;

    public void setX(Long x) {
        this.x = x;
    }
    public Long getX() {
        return x;
    }
    public void setY(Long y) {
        this.y = y;
    }
    public Long getY() {
        return y;
    }

    public Coordinates () {}

    @Override
    public int compareTo(Coordinates o) {
        return (int) (Math.sqrt(Math.pow(getX().doubleValue(), 2) + Math.pow(getY().doubleValue(), 2)) -
                Math.sqrt(Math.pow(o.getX().doubleValue(), 2) + Math.pow(o.getY().doubleValue(), 2)));
    }

    @Override
    public String toReadString() {
        return "Coordinates >>\n" +
                "   X: " + x + "\n"+
                "   Y: " + y;
    }
}