package clase;

public class DocumentWord implements Document{
    @Override
    public void export() {
        System.out.println("Documentul Word a fost exportat cu succes!");
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Acesta este documentul Word!");
    }
}
