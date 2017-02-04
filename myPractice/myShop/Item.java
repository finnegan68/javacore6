package myPractice.myShop;

/**
 * Created by Илья on 04.02.2017.
 */
public class Item {
    private String name;
    private double cost;
    private String description;

    public Item(String n, double c, String d){
        name = n;
        cost = c;
        description = d;
    }
    public String getName(){
        return name;
    }
    public double getCost(){
        return cost;
    }
    public String getDescription(){
        return description;
    }

 }

