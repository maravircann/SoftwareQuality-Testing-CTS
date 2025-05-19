package clase;

public class TransportTroleibuz extends MijlocTransportHandler{
    @Override
    public void recomanda(int distanta) {
        if(distanta<3){
            System.out.println("Poti lua tramvaiul!");
        }else{
            super.getNext().recomanda(distanta);
        }
    }
}
