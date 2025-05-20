package clase;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public Client(String nume, ModPlata modPlata) {
        super();
        this.nume = nume;
        this.modPlata = modPlata;
    }

    //in cazul in care nu se specifica modalitatea de plata
    public Client(String nume) {
        super();
        this.nume = nume;
        this.modPlata = new Cash();
    }

    public void plateste(double sumaPlata){
        modPlata.plateste(this.nume, sumaPlata);
    }
}
