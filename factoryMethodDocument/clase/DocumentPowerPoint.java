package clase;

public class DocumentPowerPoint implements Document {
    @Override
    public void export() {
        System.out.println("Documentul Power Point a fost exportat cu succes!");
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Acesta este documentul Power Point!");
    }
}
