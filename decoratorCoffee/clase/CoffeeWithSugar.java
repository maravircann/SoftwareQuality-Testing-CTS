package clase;

public class CoffeeWithSugar extends CoffeeDecorator{
    public CoffeeWithSugar(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public void addDescription() {
        System.out.println("This coffee contains sugar!");
    }
}
