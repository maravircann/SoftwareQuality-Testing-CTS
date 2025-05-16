package program;

import clase.FlyweightFactory;
import clase.Spitalizare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        FlyweightFactory factory=new FlyweightFactory();

        Spitalizare spitalizare1=new Spitalizare(1, 23, 5);
        Spitalizare spitalizare2=new Spitalizare(1, 24, 3);
        Spitalizare spitalizare3=new Spitalizare(1, 25, 6);

        factory.getPacient("maria", "0772427532", "str libertatii").afisareInformatii(spitalizare1);
        factory.getPacient("adrian", "078895236", "str unirii").afisareInformatii(spitalizare2);
        factory.getPacient("oana", "07427417432", "str regina eli").afisareInformatii(spitalizare3);

        factory.getPacient("ion", "072531722", "str fericirii").afisareInformatii(spitalizare1);
        factory.getPacient("andrei").afisareInformatii(spitalizare2);
    }
}