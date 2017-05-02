package module7;


import java.util.Comparator;

public class ByPriceIncreaseAndCity implements Comparator<Order>{

    @Override
    public int compare(Order o1, Order o2) {
        int answer = o1.getPrice() - o2.getPrice();
        if(answer == 0){
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        }
        return o1.getPrice() - o2.getPrice();
    }
}
