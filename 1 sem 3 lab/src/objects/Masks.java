package objects;

import help.MasksAbstract;

public class Masks extends MasksAbstract {
    public Masks(String name, Boolean window) {
        super(name ,window);
    }

    public void printMaskType(Window win) {
        if (inWindow()) {
            System.out.println("В '" + win.getName() + "' есть маска '" + getName() + "'");
        }
        else System.out.println("Вот маска типа '" + getName() + "'");
    }
}
