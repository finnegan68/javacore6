package PetProject;


import java.util.Hashtable;

public class Basket {
    /**
     * Key of hashtable is part number of product.
     * Value is number of this products.
     */
    private Hashtable<Long, Integer> myBasket = new Hashtable<>(0);

    public Basket(Hashtable<Long, Integer> myBasket) {
        this.myBasket = myBasket;
    }

    public Hashtable<Long, Integer> getMyBasket() {
        return myBasket;
    }
}
