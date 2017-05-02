package module7;


import java.util.Comparator;

public class ByItemnameShopidCity implements Comparator<Order>{

    @Override
    public int compare(Order o1, Order o2) {
        int answ1 = o1.getItemName().compareTo(o2.getItemName());
        if(answ1 == 0){
            long answ2 = o1.getId() - o2.getId();
            if (answ2 == 0){
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            else if(answ2 > 0){
                return 1;
            }
            else{
                return -1;
            }
        }
        return answ1;
    }
}
