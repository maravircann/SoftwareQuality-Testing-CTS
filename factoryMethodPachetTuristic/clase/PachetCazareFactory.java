package clase;

public class PachetCazareFactory implements PachetTuristicFactory{

    @Override
    public PachetTuristic crearePachet() {
        return new PachetCazare();
    }
}
