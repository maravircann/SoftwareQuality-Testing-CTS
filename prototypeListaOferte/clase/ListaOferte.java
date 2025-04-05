package clase;

import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements IListaOferte{
    private List<String> listaOferte=new ArrayList<>();

    public ListaOferte() {
    }

    public ListaOferte(List<String> listaOferte) {
        this.listaOferte = listaOferte;
    }

    public void setListaOferte(List<String> listaOferte) {
        this.listaOferte = listaOferte;
    }


    @Override
    public IListaOferte copy() {
        ListaOferte oferte=new ListaOferte();
        ArrayList<String> listaCopie=new ArrayList<>();
        for(String s : this.listaOferte){
            listaCopie.add(s);
        }
        oferte.setListaOferte(listaCopie);

         return oferte;
    }

    @Override
    public void incarcaListaOferte() {
        listaOferte.addAll(List.of("Grecia", "Turcia", "Egipt", "Maroc", "Spania", "Italia"));
    }

    @Override
    public String toString() {
        return "ListaOferte{" +
                "listaOferte=" + listaOferte +
                '}';
    }
}
