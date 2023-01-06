package objects;

import help.MasksAbstract;

public class Masks extends MasksAbstract {
    public Masks(String name, Boolean window) {
        super(name ,window);
    }

    public void printMaskType(Window win) {
        if (inWindow()) {
            System.out.println("В '" + win.getName() + "' стоит маска '" + getName() + "'");
        }
        else System.out.println("Вот маска типа '" + getName() + "'");
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
        Masks win = (Masks) obj;
        return super.equals(win);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + "name=" + super.getName() + "]";
    }
}
