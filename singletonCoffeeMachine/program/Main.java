package program;

import clase.CoffeeMachineSingleton;
import clase.Order;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CoffeeMachineSingleton instance=CoffeeMachineSingleton.getInstance();

        Order order1=new Order("esspreso", 5, 70.5F);
        Order order2=new Order("latte", 3, 90F);
        instance.addOrder(order1);
        instance.addOrder(order2);


    }
}