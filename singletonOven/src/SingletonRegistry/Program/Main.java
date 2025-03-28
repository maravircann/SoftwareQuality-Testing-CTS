package SingletonRegistry.Program;

import SingletonRegistry.Clase.Dish;
import SingletonRegistry.Clase.Oven;
import SingletonRegistry.Clase.OvenRegistry;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dish d1 = new Dish("Pizza", 12, 250);
        Dish d2 = new Dish("Lasagna", 15, 230);
        Dish d3 = new Dish("Pasta", 20, 270);
        Dish d4 = new Dish("Apple pie", 10, 200);
        Dish d5 = new Dish("Salmon", 18, 260);

        List<Dish> dishes = List.of(d1, d2, d3, d4, d5);

        for(int i=0;i<4;i++){
            OvenRegistry.getOven(i);
        }

        for(Dish dish:dishes){
            Oven bestOven=null;
            int minDishes=Integer.MAX_VALUE;

            for(int i=0;i<4;i++){
                Oven oven=OvenRegistry.getOven(i);
                if(dish.getTemperature()<=oven.getMaxTemperature()){
                    if(oven.getDishes().size()<minDishes){
                        bestOven=oven;
                        minDishes=oven.getDishes().size();
                    }
                }
            }
            if(bestOven!=null){
                bestOven.addDish(dish);
                System.out.println("Added "+dish.getName()+" in the oven "+bestOven.getId());

            }else{
                System.out.println("No oven available!");
            }
        }

      OvenRegistry.displayAllOvens();

    }
}
