package clase;

public class CarteBuilder implements ICarte{

    private  String titlu;
    private  String autor;
    private  int nrPagini;
    private  boolean esteDisponibila;
    private  String gen;

    public CarteBuilder setTitlu(String titlu) {
        this.titlu = titlu;
        return this;
    }

    public CarteBuilder setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public CarteBuilder setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
        return this;
    }

    public CarteBuilder setEsteDisponibila(boolean esteDisponibila) {
        this.esteDisponibila = esteDisponibila;
        return this;
    }

    public CarteBuilder setGen(String gen) {
        this.gen = gen;
        return this;
    }

    public void reset(){
        this.autor=null;
        this.titlu=null;
        this.nrPagini=0;
        this.esteDisponibila=false;
        this.gen=null;
    }

    @Override
    public Carte build() {
        if(titlu==null){
            throw new IllegalArgumentException("Cartea trebuie sa aiba un titlu!");
        }
        if(autor==null){
            throw new IllegalArgumentException("Cartea trebuie sa aiba un autor!");
        }
        if(nrPagini<=0){
            throw new IllegalArgumentException("Cartea nu are un numar de pagini valid!");

        }

        Carte carte=new Carte(this.titlu, this.autor, this.nrPagini, this.esteDisponibila, this.gen);
        this.reset();
        return carte;
    }
}
