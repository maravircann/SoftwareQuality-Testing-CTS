package clase;

public class Spitalizare {
    private int nrSalon;
    private int nrPat;
    private int nrZileSpitalizare;

    public Spitalizare(int nrSalon, int nrPat, int nrZileSpitalizare) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    @Override
    public String toString() {
        return "Spitalizare{" +
                "nrSalon=" + nrSalon +
                ", nrPat=" + nrPat +
                ", nrZileSpitalizare=" + nrZileSpitalizare +
                '}';
    }
}
