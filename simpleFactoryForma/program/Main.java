package program;

import clase.FormaFactory;
import clase.IForma;
import clase.TipForma;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        FormaFactory formaFactory=new FormaFactory();
        IForma cerc=formaFactory.creareForma(TipForma.cerc);
        IForma patrat=formaFactory.creareForma(TipForma.patrat);

        cerc.afiseazaDetalii();
    }
}