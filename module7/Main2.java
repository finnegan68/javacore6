package module7;

import module4.Currency;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {

        SortedSet<Order> orders = new TreeSet<>();

        User[] users = new User[4];
        users[0] = new User(456, "Vasya", "Kek", "Kyiv", 10500);
        users[1] = new User(457, "Petya", "Lol", "New-York", 4500);
        users[2] = new User(458, "Mr", "Azaza", "Tokio", 5500);
        users[3] = new User(458, "Mr", "Azaza", "Tokio", 5500);

        orders.add(new Order(123,1000, Currency.USD, "Iphone", "Apple", users[0]));
        orders.add(new Order(126,500, Currency.USD, "Mac", "Apple", users[1]));
        orders.add(new Order(125,500000, Currency.USD, "House", "lol", users[2]));
        orders.add(new Order(125,500000, Currency.USD, "House", "lol", users[2]));

        for(Order order : orders){
            System.out.println(order.getId());
        }

        System.out.println(containUser("Petrov", (TreeSet<Order>) orders));

        for(Order order : orders){
            System.out.println(order.getId());
        }
        System.out.println("Get the highest price");
        System.out.println(orders.last().getPrice());

        Iterator iter = orders.iterator();
        while (iter.hasNext()){
            Order order = (Order) iter.next();
            if(order.getCurrency() == Currency.USD){
                iter.remove();
            }
        }
        System.out.print("Is orders empty? ");
        System.out.print(orders.isEmpty());

    }

    public static boolean containUser(String user, TreeSet<Order> orders){
        for(Order order : orders){
            if(order.getUser().getLastName() == user){
                return true;
            }
        }
        return false;
    }
}
