package myPractice.myShop;

/**
 * Created by Илья on 04.02.2017.
 */
public class Order {
    private double sum;
    private Item[] myOrder;
    private int tmp = 0;
    public Order(int numOfItems){
        myOrder = new Item[numOfItems];
        sum = 0;
    }
    public void setSum(double price){
        sum += price;
    }
    public double getSum(){
        return sum;
    }
    public void append(Item book){
        myOrder[tmp] = book;
        setSum(book.getCost());
        tmp++ ;
    }
}
