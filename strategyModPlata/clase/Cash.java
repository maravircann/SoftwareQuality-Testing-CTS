package clase;

public class Cash implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlata) {
        System.out.println(numeClient+" a efectuat o plata cash in valoare de "+sumaPlata+" lei.");
    }
}
