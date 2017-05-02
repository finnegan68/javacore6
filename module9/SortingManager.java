package module9;

import module4.Currency;
import module7.Order;

import java.util.*;
import java.util.function.Predicate;

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
    public List<Order> filterOrders(List<Order> myOrders, Predicate<Order> myPredicate){
        List<Order> answer = new ArrayList<>();
        for(Order order : myOrders){
            if(myPredicate.test(order)){
                answer.add(order);
            }
        }
        return answer;
    }
    public List<Order> getOrdersWherePriceLessThen(List<Order> orders, int price){
        return filterOrders(orders, x -> x.getPrice() < price);
    }
    public List<List<Order>> divedeByCurrency(List<Order> orders){
        List<Order> dollars = filterOrders(orders, x -> x.getCurrency() == Currency.USD);
        List<Order> euro = filterOrders(orders, x -> x.getCurrency() == Currency.EUR);
        List<List<Order>> answer = new ArrayList<>();
        answer.add(dollars);
        answer.add(euro);
        return answer;
    }
    public LinkedHashSet<Order> getUniqueOrders(List<Order> orders){
        return new LinkedHashSet<Order>(orders);
    }
    public boolean isThereThisMan(List<Order> orders, String name){
        List<Order> answer = filterOrders(orders, x -> x.getUser().getLastName() == name);
        if(answer.size() > 0){
            return true;
        }
        return false;
    }
    public void delDollars(List<Order> orders){
        orders = filterOrders(orders, x -> x.getCurrency() != Currency.USD);
    }
    public List<List<Order>> divideByCity(List<Order> orders){
        List<List<Order>> answer = new ArrayList<>();
        List<String> cities = new ArrayList<>();
        for(Order order : orders){
            cities.add(order.getUser().getCity());
        }
        Set<String> uniqueCities = new LinkedHashSet<>(cities);
        for(String city : uniqueCities){
            List<Order> newList = new ArrayList<>();
            for(Order order : orders){
                if(order.getUser().getCity() == city){
                    newList.add(order);
                }
            }
            answer.add(newList);
        }
        return answer;
    }
}
