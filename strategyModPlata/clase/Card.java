package clase;

public class Card implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlata) {
        System.out.println(numeClient+" a efectuat o plata cu cardul in valoare de "+sumaPlata+" lei.");
    }
}
