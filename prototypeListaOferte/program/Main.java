package program;

import clase.IListaOferte;
import clase.ListaOferte;

public class Main {
    public static void main(String[] args) {
        IListaOferte listaOferte=new ListaOferte();
        listaOferte.incarcaListaOferte();

        IListaOferte listaCopie=listaOferte.copy();

        System.out.println(listaCopie);
    }
}