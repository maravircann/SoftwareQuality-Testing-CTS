package clase;

public class PayPal implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlata) {
        System.out.println(numeClient+" a efectuat o plata prin paypal in valoare de "+sumaPlata+" lei.");
    }
}
