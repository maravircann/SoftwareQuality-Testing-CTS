package clase;

public class TransportTramvai extends MijlocTransportHandler{
    @Override
    public void recomanda(int distanta) {
        if(distanta>=5 && distanta<10){
            System.out.println("Poti lua travaiul!");
        }else{
            super.getNext().recomanda(distanta);
        }
    }
}
