package clase;

public class FormaFactory {
    public IForma creareForma(TipForma tipForma) throws Exception {
        switch (tipForma){
            case cerc -> {
                return new Cerc();
            }
            case patrat -> {
                return new Patrat();
            }
            case triunghi -> {
                return new Triunghi();
            }
            case dreptunghi -> {
                return new Dreptunghi();
            }
            case null, default -> {
                throw new Exception("Tipul nu a fost introdus corect!");
            }
        }
    }
}
