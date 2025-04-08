package clase;

public class Carte {
    private  String titlu;
    private  String autor;
    private  int nrPagini;
    private  boolean esteDisponibila;
    private  String gen;

    Carte() {
    }

     Carte(String titlu, String autor, int nrPagini, boolean esteDisponibila, String gen) {
        this.titlu = titlu;
        this.autor = autor;
        this.nrPagini = nrPagini;
        this.esteDisponibila = esteDisponibila;
        this.gen = gen;
    }

    private void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    private void setEsteDisponibila(boolean esteDisponibila) {
        this.esteDisponibila = esteDisponibila;
    }

    private void setGen(String gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", nrPagini=" + nrPagini +
                ", esteDisponibila=" + esteDisponibila +
                ", gen='" + gen + '\'' +
                '}';
    }
}
