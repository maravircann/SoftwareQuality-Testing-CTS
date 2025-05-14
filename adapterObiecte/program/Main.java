package program;

import clase.PachetMasinaInchiriata;
import clase.PachetTuristic;
import masini.Masina;
import masini.MasinaInchiriata;


public class Main {
    private static void printeazaRezervare(PachetTuristic pachetTuristic) {
        System.out.print("Pentru client: ");
        pachetTuristic.descriere();
        System.out.print("Pentru Operator: ");
        pachetTuristic.rezervaPachet();
    }
    public static void main(String[] args) {

        Masina masina=new Masina("bmw", 1234.5);
        MasinaInchiriata masinaInchiriata=new MasinaInchiriata(masina);

        PachetTuristic adapter=new PachetMasinaInchiriata(masinaInchiriata);


        printeazaRezervare(adapter);
    }
}