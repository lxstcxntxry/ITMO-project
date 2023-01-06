package objects;

import help.WindowInterface;

public class Window implements WindowInterface {

    private String name;

    public Window(String name){
        this.name = name;
        printThing();
    }

    private void printThing() {
        System.out.println("Есть объект '" + name + "'");
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
        Window win = (Window) obj;
        return super.equals(win);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + "name=" + name + "]";
    }
}
