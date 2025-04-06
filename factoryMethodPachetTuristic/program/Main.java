package program;

import clase.PachetCazareFactory;
import clase.PachetTransportFactory;
import clase.PachetTuristic;
import clase.PachetTuristicFactory;

public class Main {
    public static void main(String[] args) {
        PachetTuristicFactory pachetCazareFactory=new PachetCazareFactory();
        PachetTuristicFactory pachetTransportFactory=new PachetTransportFactory();

        PachetTuristic pachetCazare=pachetCazareFactory.crearePachet();
        PachetTuristic pachetTransport=pachetTransportFactory.crearePachet();

        pachetTransport.afiseazaDetalii();
        pachetCazare.afiseazaDetalii();
    }
}