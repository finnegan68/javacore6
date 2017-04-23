package module7;


import java.util.Comparator;

public class byItemNameAndIdAndUserCity implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        if(o1.getItemName().compareTo(o2.getItemName()) == 0){
            if(o1.getId() == o2.getId()){
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return Long.compare(o1.getId(), o2.getId());
        }
        return o1.getItemName().compareTo(o2.getItemName());
    }
}
