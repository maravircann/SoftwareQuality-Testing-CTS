package claseRegistry;

public class CoffeeMachine {
    private int idMachine;

    CoffeeMachine(int idMachine) {
        this.idMachine = idMachine;
    }

    public int getIdMachine() {
        return idMachine;
    }

    public void setIdMachine(int idMachine) {
        this.idMachine = idMachine;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "idMachine=" + idMachine +
                '}';
    }

    public void addOrder(OrderRegistry order){
        System.out.println("preparing order...");
        try {
            Thread.sleep(order.getPrepTime()*1000L);
        } catch (InterruptedException e) {
            System.out.println("interrupted while preparing "+order.getName());
        }
        System.out.println("done! order:"+order.getName()+" at "+order.getPrepTemperature()+ "C\"");
    }
}
