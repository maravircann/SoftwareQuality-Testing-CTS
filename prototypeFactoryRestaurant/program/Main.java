package program;

import clase.Rezervare;
import clase.RezervareFactory;
import clase.TipRezervare;

public class Main {
    public static void main(String[] args) {
        RezervareFactory rezervareFactory=new RezervareFactory();

        Rezervare rezervareStandard=new Rezervare("Florescu", 20, "0789889452");
        Rezervare rezervareVIP=new Rezervare("Ionescu", 23, "0788996543");

        rezervareFactory.inregistreaza(TipRezervare.standard, rezervareStandard);
        rezervareFactory.inregistreaza(TipRezervare.vip, rezervareVIP);

        //clonare
        Rezervare r1= (Rezervare) rezervareFactory.creeazaCopie(TipRezervare.standard);
        Rezervare r2= (Rezervare) rezervareFactory.creeazaCopie(TipRezervare.vip);

        System.out.println(r2);
        r1.setNume("Client nou");
        System.out.println(r1);
    }
}