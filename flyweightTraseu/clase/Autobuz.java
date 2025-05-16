package clase;

public class Autobuz implements IAutobuz{
    private String nrInmatriculare;
    private String model;
    private int anFabricatie;
    private int nrLocuri;

    public Autobuz(String nrInmatriculare, String model, int anFabricatie, int nrLocuri) {
        this.nrInmatriculare = nrInmatriculare;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "nrInmatriculare='" + nrInmatriculare + '\'' +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", nrLocuri=" + nrLocuri +
                '}';
    }

    @Override
    public void afiseazaInformatii(Traseu traseu) {
        System.out.println(this.toString()+traseu.toString());
    }
}
