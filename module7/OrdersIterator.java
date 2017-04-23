package module7;


import java.util.Iterator;
import java.util.Set;

public class OrdersIterator implements Iterator<Order>{

    private Set<Order> setOfOrders;
    private int position;

    public OrdersIterator(Set<Order> setOfOrders) {
        this.setOfOrders = setOfOrders;
        this.position = -1;
    }

    @Override
    public boolean hasNext() {
        return setOfOrders.size() > position + 1;
    }

    @Override
    public Order next() {
        return null;
    }
}
