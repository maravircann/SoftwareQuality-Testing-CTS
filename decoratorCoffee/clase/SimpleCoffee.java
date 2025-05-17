package clase;

public class SimpleCoffee implements ICoffee{

    private float price;

    public SimpleCoffee(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public void description() {
        System.out.println("One simple coffee for "+this.price);
    }
}
