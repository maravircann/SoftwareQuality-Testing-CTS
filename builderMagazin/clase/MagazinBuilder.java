package clase;

public class MagazinBuilder implements IMagazin{

    private String denumire;
    private int suprafata;
    private int nrIntrari;
    private float duritatePodea;
    private String decoratiune;

    public MagazinBuilder() {

    }

    public MagazinBuilder setDenumire(String denumire) {
        this.denumire = denumire;
        return this;
    }

    public MagazinBuilder setSuprafata(int suprafata) {
        this.suprafata = suprafata;
        return this;
    }

    public MagazinBuilder setNrIntrari(int nrIntrari) {

            this.nrIntrari = nrIntrari;
            return this;


    }

    public MagazinBuilder setDuritatePodea(float duritatePodea) {
        this.duritatePodea = duritatePodea;
        return this;
    }

    public MagazinBuilder setDecoratiune(String decoratiune) {

            this.decoratiune = decoratiune;
            return this;


    }

    public void reset(){
        this.denumire="";
        this.suprafata=0;
        this.nrIntrari=1;
        this.duritatePodea=1.5f;
        this.decoratiune="";
    }

    @Override
    public Magazin build() {
        if(denumire==null){
            throw new IllegalArgumentException("Este necesara o denumire pentru magazin");
        }
        if (suprafata <= 0) {
            throw new IllegalArgumentException("Suprafata trebuie sa fie pozitiva.");
        }
        if(nrIntrari<suprafata/100.0){
            throw new IllegalArgumentException("Sunt prea putine intrai pentru aceasta suprafata!");
        }
        if(duritatePodea<2 && "Sticla".equalsIgnoreCase(decoratiune)){
            throw new IllegalArgumentException("Nu poti avea sticla pe podea moale!");
        }

        Magazin magazin=new Magazin(this.denumire, this.suprafata, this.nrIntrari, this.duritatePodea, this.decoratiune);
        this.reset();
        return magazin;
    }
}
