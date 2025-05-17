package clase;

public class Sectie implements IStructura{

    private final String denumire;

    public Sectie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void descriereStructura() {
        System.out.println("Sectie: "+denumire);
    }

    @Override
    public void adaugaStructura(IStructura s) {
    throw new UnsupportedOperationException();
    }

    @Override
    public void stergeStructura(IStructura s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IStructura getStructura(int index) {
        throw new UnsupportedOperationException();
    }
}
