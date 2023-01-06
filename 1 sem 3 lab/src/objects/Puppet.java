package objects;

import help.AdjectiveEnum;
import help.PuppetInterface;

public class Puppet implements PuppetInterface {
    private String name;
    private String place;

    public Puppet(String name) {
        this.name = name;
    }

    public void place(String place){
        this.place = place;
        printPuppet();
    }

    public void printPuppet() {
        System.out.println("'" + place + "' есть маникен '" + name + "'");
    }

    public void printPuppet(AdjectiveEnum adj) {
        if (adj.equals(AdjectiveEnum.MASTERFUL)) {
            System.out.println("'" + place + "' есть Мастерский маникен '" + name + "'");
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!this.getClass().equals(obj.getClass())) return false;
        Puppet win = (Puppet) obj;
        return super.equals(win);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + "name=" + name + "]";
    }
}
