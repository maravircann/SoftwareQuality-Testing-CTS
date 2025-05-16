package clase;

public class Traseu {
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Traseu(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        return "Traseu{" +
                "nrLinie=" + nrLinie +
                ", primaStatie='" + primaStatie + '\'' +
                ", ultimaStatie='" + ultimaStatie + '\'' +
                '}';
    }
}
