package myPractice.myShop;

/**
 * Created by Илья on 04.02.2017.
 */
public class BookShop {
    private Item[] items;

    public BookShop(int numOfItems){
        items = new Item[numOfItems];
    }
    public void getAllNames(){
        for (int i = 0; i < items.length; i++) {
            System.out.println((i+1) + "." + items[i].getName());
        }
    }
    public void getAllDescriptions(){
        for (int i = 0; i < items.length; i++) {
            System.out.println((i+1) + "." + items[i].getDescription());
        }
    }
    public String getBooksName(int numInList){
        return items[numInList].getName();
    }
    public int getShopSize(){
        return items.length;
    }
    public void addBook(int number,String name, double cost, String description){
        items[number] = new Item(name, cost, description);
    }
    public Item getItem(int numOfItem){
        return items[numOfItem];
    }

}
