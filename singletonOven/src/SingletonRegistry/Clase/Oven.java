package SingletonRegistry.Clase;

import java.util.ArrayList;
import java.util.List;

public class Oven {
    private int id;
    private int maxTemperature;
    private List<Dish> dishes;


    public Oven(int id, int maxTemperature) {
        this.id = id;
        this.maxTemperature = maxTemperature;
        this.dishes = new ArrayList<Dish>();
    }

    public int getId() {
        return id;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public List<Dish> getDishes() {
        return dishes;
    }



    public boolean addDish(Dish dish){
        if(dish.getTemperature()<=maxTemperature){
            dishes.add(dish);
            return true;
        }
        return false;
    }

  public void seeDishes(){
        System.out.println("oven "+id+" (max temp: " +maxTemperature+" C): ");
        for (Dish d: dishes){
            System.out.println(" ->"+d);
        }
    }

}
