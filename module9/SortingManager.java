package module9;

import module7.Order;
import java.util.Collections;
import java.util.List;

public class SortingManager {

    public void sortByPriceIncrease(List<Order> someList) {
        Collections.sort(someList, (Order order1, Order order2) -> Integer.valueOf(order1.getPrice()).compareTo(Integer.valueOf(order2.getPrice())));
    }
    public void sortByPriceDecreaseAndCity(List<Order> someList){
        Collections.sort(someList, (Order order1, Order order2) -> {
            int answ1 = Integer.valueOf(order2.getPrice()).compareTo(Integer.valueOf(order1.getPrice()));
            if (answ1 == 0) return order2.getUser().getCity().compareTo(order1.getUser().getCity());
            return answ1;
        });
    }
    public void sortByNameAndIdAndCity(List<Order> someList) {
        Collections.sort(someList, (Order order1, Order order2) -> {
            int answ1 = order1.getItemName().compareTo(order2.getItemName());
            int answ2 = Long.valueOf(order1.getId()).compareTo(Long.valueOf(order2.getId()));
            int answ3 = order1.getUser().getCity().compareTo(order2.getUser().getCity());
            if(answ1 != 0) return answ1;
            else if(answ2 != 0) return answ2;
            return answ3;
        });
    }

}
