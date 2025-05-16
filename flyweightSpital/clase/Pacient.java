package clase;

public class Pacient implements IPacient {
    private String nume;
    private String nrtelefon;
    private String adresa;

    public Pacient(String nume, String nrtelefon, String adresa) {
        this.nume = nume;
        this.nrtelefon = nrtelefon;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrtelefon() {
        return nrtelefon;
    }

    public void setNrtelefon(String nrtelefon) {
        this.nrtelefon = nrtelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", nrtelefon='" + nrtelefon + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }

    @Override
    public void afisareInformatii(Spitalizare spitalizare) {
        System.out.println(this.toString()+spitalizare.toString());
    }
}
