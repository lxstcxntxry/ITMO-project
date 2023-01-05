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
}
