package program;

import clase.Magazin;
import clase.MagazinBuilder;


public class Main {
    public static void main(String[] args) {
        MagazinBuilder builder=new MagazinBuilder();
        Magazin magazin1=builder.setDenumire("Mazagin1").setSuprafata(40).setNrIntrari(1).setDuritatePodea(2).setDecoratiune("Sticla").build();

        System.out.println(magazin1);

        Magazin magazin2=builder.setDenumire("Magazin2").setSuprafata(30).setNrIntrari(2).build();
        System.out.println(magazin2);

        //testare validari
//        Magazin magazin3=builder.setDenumire("Magazin3").setSuprafata(500).setNrIntrari(2).build();
//        System.out.println(magazin3);
//
//        Magazin magazin4=builder.setDenumire("Magazin3").setSuprafata(50).setNrIntrari(4).setDuritatePodea(1.3f).setDecoratiune("Sticla").build();
//        System.out.println(magazin4);
    }
}