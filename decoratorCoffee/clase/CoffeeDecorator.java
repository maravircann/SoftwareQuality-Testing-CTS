package clase;

public abstract class CoffeeDecorator implements ICoffee{
    private ICoffee coffee;

    public CoffeeDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void description() {
    this.coffee.description();
    addDescription();
    }
    public abstract void addDescription();
}
