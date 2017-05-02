package module7;


import module4.Currency;
import java.util.TreeSet;

public class MainWithTreeSet {
    public static void main(String[] args) {

        TreeSet<Order> orders = new TreeSet<Order>();

        User[] users = new User[3];

        users[0] = new User(123,"Valera", "Varerich", "Kyiv",16342);
        users[1] = new User(124, "Petr","Petrov", "Rome", 19236);
        users[2] = new User(125,"Vasiliy", "Vasilich","Moskow", 43523);

        Order ordr1 = new Order(456,409, Currency.USD, "Ball", "Nike", users[0]);
        Order ordr2 = new Order(457,2000, Currency.USD, "Iphone", "Apple", users[1]);
        Order ordr3 = new Order(458,1000, Currency.USD, "Katana", "YaponaMat", users[2]);

        orders.add(ordr1);
        orders.add(ordr2);
        orders.add(ordr3);


    }
}
