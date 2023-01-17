package utils;

public class ConsolePrinter implements PrinterInterface {

    @Override
    public void printString(String str) {
        System.out.println(str);
    }
}
