package clase;

public class TransportAutobuz extends MijlocTransportHandler{

    @Override
    public void recomanda(int distanta) {
        if(distanta>=3 && distanta<5){
            System.out.println("Poti lua autobuzul!");
        }else{
            super.getNext().recomanda(distanta);
        }
    }
}
