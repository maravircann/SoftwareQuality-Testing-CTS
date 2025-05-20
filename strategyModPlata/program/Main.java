package program;

import clase.Card;
import clase.Cash;
import clase.Client;
import clase.PayPal;

public class Main {
    public static void main(String[] args) {

        Client client=new Client("Popescu");

        client.plateste(120);

        client.setModPlata(new PayPal());
        client.plateste(300);

        client.setModPlata(new Card());
        client.plateste(140);


    }
}