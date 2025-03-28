package SingletonSimplu.Clase;

import java.util.ArrayList;
import java.util.List;

public class Oven {
    private int id;
    private int maxTemperature;
    private List<Dish> dishes;


    private Oven(){
        this.id=1;
        this.maxTemperature=270;
        this.dishes = new ArrayList<>();
    }

    private static final Oven instance=new Oven();

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

    public static Oven getInstance() {
        return instance;
    }
}
