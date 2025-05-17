package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        ICoffee coffee=new SimpleCoffee(6.5f);

        coffee=new CoffeeWithSugar(coffee);
        coffee=new IcedCoffee(coffee);

        coffee.description();

    }
}