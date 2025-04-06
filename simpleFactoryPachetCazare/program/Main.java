package program;


import clase.PachetTuristic;
import clase.PachetTuristicFactory;
import clase.TipPachet;

public class Main {
    public static void main(String[] args) throws Exception {

        PachetTuristicFactory pachetTuristicFactory=new PachetTuristicFactory();
        PachetTuristic pachetCazare=pachetTuristicFactory.crearePachet(TipPachet.PACHET_CAZARE);
        PachetTuristic pachetTransport=pachetTuristicFactory.crearePachet(TipPachet.PACHET_TRANSPORT);

        pachetTransport.afiseazaDetalii();
        pachetCazare.afiseazaDetalii();
    }
}