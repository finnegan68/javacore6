package module7;


import java.util.Comparator;

public class ByPriceIncreaseAndUserCity implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        int answ1 = o1.getPrice() - o2.getPrice();
        if(answ1 != 0){
            return answ1;
        }
        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
    }
}
