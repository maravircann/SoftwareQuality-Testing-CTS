package clase;

public interface IStructura {
    public void descriereStructura();
    public void adaugaStructura(IStructura s);
    public void stergeStructura(IStructura s);
    public IStructura getStructura(int index);
}
