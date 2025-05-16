package program;

import clase.FlyweightFactory;
import clase.Traseu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        FlyweightFactory factory=new FlyweightFactory();

        Traseu traseu1=new Traseu(32, "rahova", "unirii");
        Traseu traseu2=new Traseu(41, "tineretului", "pipera");

        factory.getAutobuz("B123NSA", "model1", 1998, 23).afiseazaInformatii(traseu1);
        factory.getAutobuz("B328BNU", "model2", 2013, 44).afiseazaInformatii(traseu2);

        factory.getAutobuz("B216NUM").afiseazaInformatii(traseu2);
    }
}