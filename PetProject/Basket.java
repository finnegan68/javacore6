package PetProject;


import java.util.LinkedHashMap;

public class Basket {
    /**
     * Key of hashtable is id of product.
     * Value is number of this products.
     */
    private LinkedHashMap<Long, Integer> myBasket;

    public Basket(LinkedHashMap myBasket) {
        this.myBasket = myBasket;
    }

    public LinkedHashMap<Long, Integer> getMyBasket() {
        return myBasket;
    }
}
