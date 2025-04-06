package clase;

public class Rezervare implements IRezervare{
    private String nume;
    private int nrPersoane;
    private String nrTelefon;

    public Rezervare() {
    }

    public Rezervare(String nume, int nrPersoane, String nrTelefon) {
        this.nume = nume;
        if(nrPersoane<13){
            throw new IllegalArgumentException();
        }
        this.nrPersoane = nrPersoane;
        if(nrTelefon.length()<10){
            throw new IllegalArgumentException();
        }
        if(nrTelefon.startsWith("0040")){
            throw new IllegalArgumentException();
        }
        this.nrTelefon = nrTelefon;
    }

    @Override
    public IRezervare copy() {
        Rezervare rezervare=new Rezervare();
        rezervare.nrPersoane=this.nrPersoane;
        rezervare.nrTelefon=this.nrTelefon;
        rezervare.nume=this.nume;
        return rezervare;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nume='" + nume + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", nrTelefon='" + nrTelefon + '\'' +
                '}';
    }
}
