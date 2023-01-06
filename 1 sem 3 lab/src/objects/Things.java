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
        String temp = "";
        if (getPuppet()){
            switch (adj) {
                case PLAID -> temp = "' Клетчатый '";
                case CUPRUM -> temp = "' Медный '";
                case BIG -> temp = "' Большой '";
                case MASTERFUL -> temp = "' Мастерский '";
                case ELECTRIC -> temp = "' Электрический '";
                case BLACK -> temp = "' Черный '";
            }
            System.out.println("На '" + puppet.getName() + temp + getName() + "'");
        }
    }

    public void inWindow(Window win) {
        if (getWindow()) {
            System.out.println("Ещё в '" + win.getName() + "' есть предмет '" + getName() + "'");
        }
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
        Things other = (Things) obj;
        return super.equals(other);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + "name=" + super.getName() + "]";
    }
}
