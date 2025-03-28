package SingletonSimplu.Program;

import SingletonSimplu.Clase.Dish;
import SingletonSimplu.Clase.Oven;

public class Main {
    public static void main(String[] args) {

        Dish d1 = new Dish("Pizza", 12, 250);
        Dish d2 = new Dish("Lasagna", 15, 230);
        Dish d3 = new Dish("Pasta", 20, 270);
        Dish d4 = new Dish("Apple pie", 10, 200);

        Oven oven=Oven.getInstance();

        oven.addDish(d1);
        oven.addDish(d2);
        oven.addDish(d3);
        oven.addDish(d4);

        oven.seeDishes();

        Oven oven2=Oven.getInstance();
        oven2.addDish(d2);
        oven2.addDish(d3);

        if(oven==oven2){
            System.out.println("It's the same oven!");
        }
    }
}