package program;

import clase.Carte;
import clase.CarteBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarteBuilder builder=new CarteBuilder();
        Carte carte1=builder.setTitlu("Carte1").setAutor("Autor1").setNrPagini(120).setEsteDisponibila(true).setGen("Gen1").build();
        System.out.println(carte1);

        //testare validare
        Carte carte2=builder.setTitlu(null).setAutor(null).setNrPagini(0).build();
        System.out.println(carte2);
    }
}