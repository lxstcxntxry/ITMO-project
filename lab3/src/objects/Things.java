package objects;

import help.AdjectiveEnum;
import help.ThingsAbstract;

public class Things extends ThingsAbstract {
    public Things(String name){
        super(name);
    }

    public void onPuppet(Puppet puppet) {
        if (getPuppet()) {
            System.out.println("На '" + puppet.getName() + "' есть '" + getName() + "'");
        }
    }

    public void onPuppet(Puppet puppet, AdjectiveEnum adj) {
        if (getPuppet()){
            switch (adj) {
                case PLAID -> System.out.println("На '" + puppet.getName() + "' есть Клетчатый '" + getName() + "'");
                case CUPRUM -> System.out.println("На '" + puppet.getName() + "' есть Медный '" + getName() + "'");
                case BIG -> System.out.println("На '" + puppet.getName() + "' есть Большой '" + getName() + "'");
                case MASTERFUL -> System.out.println("На '" + puppet.getName() + "' есть Мастерский '" + getName() + "'");
                case ELECTRIC -> System.out.println("На '" + puppet.getName() + "' есть Электрический '" + getName() + "'");
                case BLACK -> System.out.println("На '" + puppet.getName() + "' есть Черный '" + getName() + "'");
            }
        }
    }

    public void inWindow(Window win) {
        if (getWindow()) {
            System.out.println("Ещё в '" + win.getName() + "' есть предмет '" + getName() + "'");
        }
    }
}
