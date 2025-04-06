package clase;

public class DocumentPdf implements Document{
    @Override
    public void export() {
        System.out.println("Documentul PDF a fost exportat cu succes!");
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Acesta este documentul pdf!");
    }
}
