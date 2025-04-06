package clase;

public class PachetTransportFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic crearePachet() {
        return new PachetTransport();
    }
}
