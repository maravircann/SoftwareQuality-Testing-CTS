package program;


import clase.CoffeeMachineFacade;

public class Main {
    public static void main(String[] args) {

        CoffeeMachineFacade coffeeMachineFacade=new CoffeeMachineFacade();

        coffeeMachineFacade.brewEspresso();
        coffeeMachineFacade.brewLatte();
        coffeeMachineFacade.cleanMachine();
    }
}