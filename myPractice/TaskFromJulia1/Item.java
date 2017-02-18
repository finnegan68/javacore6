package myPractice.TaskFromJulia1;


public class Item {
    private String name;
    private double cost;
    private String description;

    public Item(String name, double cost, String description){
        this.name = name;
        this.cost = cost;
        this.description = description;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Double.compare(item.cost, cost) != 0) return false;
        if (!name.equals(item.name)) return false;
        return description.equals(item.description);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + description.hashCode();
        return result;
    }
}
