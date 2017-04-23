package module7;


import module4.Currency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<Order>(3);

        User[] users = new User[3];
        users[0] = new User(456, "Vasya", "Kek", "Kyiv", 10500);
        users[1] = new User(457, "Petya", "Lol", "New-York", 4500);
        users[2] = new User(458, "Mr", "Azaza", "Tokio", 5500);


        orders.add(new Order(123,1000, Currency.USD, "Iphone", "Apple", users[0]));
        orders.add(new Order(124,500, Currency.USD, "Mac", "Apple", users[1]));
        orders.add(new Order(125,500000, Currency.USD, "House", "lol", users[2]));

        ByPriceDecrease byPriceDecrease = new ByPriceDecrease();

        orders.sort(byPriceDecrease);

        for(Order order : orders){
            System.out.println(order.getUser().getFirstName());
        }
    }
}
