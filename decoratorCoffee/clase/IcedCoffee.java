package clase;

public class IcedCoffee extends CoffeeDecorator{
    public IcedCoffee(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public void addDescription() {
        System.out.println("This coffee contains ice!");
    }
}
