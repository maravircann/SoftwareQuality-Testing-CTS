package program;


import clase.*;

public class Main {
    public static void main(String[] args) {

        MijlocTransportHandler autobuz=new TransportAutobuz();
        MijlocTransportHandler metrou=new TransportMetrou();
        MijlocTransportHandler tramvai=new TransportTramvai();
        MijlocTransportHandler troleibuz=new TransportTroleibuz();

        troleibuz.setNext(autobuz);
        autobuz.setNext(tramvai);
        tramvai.setNext(metrou);



        troleibuz.recomanda(11);
    }
}