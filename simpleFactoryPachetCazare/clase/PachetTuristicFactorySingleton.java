package clase;

public class PachetTuristicFactorySingleton {
    private static final PachetTuristicFactorySingleton instance=new PachetTuristicFactorySingleton();

    private PachetTuristicFactorySingleton() {
    }

    public static PachetTuristicFactorySingleton getInstance() {
        return instance;
    }

    public PachetTuristic createPachet(TipPachet tipPachet){
        switch (tipPachet){
            case PACHET_CAZARE -> {
                return new PachetCazare();
            }
            case PACHET_TRANSPORT -> {
                return new PachetTransport();
            }
            default ->{
                return null;
            }
        }
    }
}
