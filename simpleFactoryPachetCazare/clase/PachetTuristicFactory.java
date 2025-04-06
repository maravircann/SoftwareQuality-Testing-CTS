package clase;

public class PachetTuristicFactory {
    public PachetTuristic crearePachet(TipPachet tipPachet) throws Exception {
        switch (tipPachet){
            case PACHET_CAZARE -> {
                return new PachetCazare();
            }
            case PACHET_TRANSPORT -> {
                return new PachetTransport();
            }
            case null, default -> {
                throw new Exception("Tipul primit nu este corect!");
            }
        }
    }
}
