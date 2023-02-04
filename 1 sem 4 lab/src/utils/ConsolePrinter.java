package utils;

public class ConsolePrinter implements PrinterInterface {

    @Override
    public void printString(String str) {

        class PrinterAddition
        {
            private final String addition;

            public PrinterAddition(String addition)
            {
                this.addition = addition;
            }

            @Override
            public String toString()
            {
                return String.format("[%s]: ", addition);
            }
        }

        System.out.println(new PrinterAddition("консольный принтер") + str);
    }
}
