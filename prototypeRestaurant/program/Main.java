package program;

import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare("Florescu", 20, "0789889452");
        Rezervare rezervare1= (Rezervare) rezervare.copy();
        System.out.println(rezervare1);

        rezervare1.setNume("Badescu");
        System.out.println(rezervare1);
    }
}