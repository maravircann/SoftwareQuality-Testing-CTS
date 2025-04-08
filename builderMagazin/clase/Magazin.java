package clase;

public class Magazin {
    private String denumire;
    private int suprafata;
    private int nrIntrari;
    private float duritatePodea;
    private String decoratiune;


     Magazin(String denumire, int suprafata, int nrIntrari, float duritatePodea, String decoratiune) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.duritatePodea = duritatePodea;
        this.decoratiune = decoratiune;
    }

    private void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    private void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

    private void setNrIntrari(int nrIntrari) {
        this.nrIntrari = nrIntrari;
    }

    private void setDuritatePodea(float duritatePodea) {
        this.duritatePodea = duritatePodea;
    }

    private void setDecoratiune(String decoratiune) {
        this.decoratiune = decoratiune;
    }


    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", suprafata=" + suprafata +
                ", nrIntrari=" + nrIntrari +
                ", duritatePodea=" + duritatePodea +
                ", decoratiune='" + decoratiune + '\'' +
                '}';
    }
}
