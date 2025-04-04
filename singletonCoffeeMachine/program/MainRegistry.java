package program;

import clase.CoffeeMachineSingleton;
import clase.Order;
import claseRegistry.CoffeeMachine;
import claseRegistry.CoffeeMachineRegistry;
import claseRegistry.OrderRegistry;

public class MainRegistry {
    public static void main(String[] args) {

        OrderRegistry o1= new OrderRegistry("latte", 4, 60.5f);
        OrderRegistry o2 = new OrderRegistry("Espresso", 3, 90f);
        OrderRegistry o3 = new OrderRegistry("Cappuccino", 5, 75f);
        OrderRegistry o4 = new OrderRegistry("Americano", 2, 80f);

        CoffeeMachine c1= CoffeeMachineRegistry.getInstances(1);
        CoffeeMachine c2=CoffeeMachineRegistry.getInstances(2);
        CoffeeMachine c3=CoffeeMachineRegistry.getInstances(3);
        CoffeeMachine c4=CoffeeMachineRegistry.getInstances(4);

        if(c1!=null) c1.addOrder(o1);
        if(c2!=null) c2.addOrder(o2);
        if(c3!=null) c3.addOrder(o3);
        if(c4!=null) c4.addOrder(o4);

        CoffeeMachineRegistry.showAll();


    }
}
