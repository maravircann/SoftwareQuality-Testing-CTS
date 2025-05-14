package program;

import clase.LegacyPrinter;
import clase.Printer;
import clase.PrinterAdapter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LegacyPrinter legacyPrinter=new LegacyPrinter();
        Printer adapter=new PrinterAdapter(legacyPrinter);
        adapter.print("salut!");
    }
}