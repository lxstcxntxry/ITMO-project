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

    private void printPuppet() {
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
}
