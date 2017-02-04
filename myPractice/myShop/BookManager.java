package myPractice.myShop;


import java.util.Scanner;

/**
 * Created by Илья on 04.02.2017.
 */
public class BookManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create our shop
        System.out.println("Enter the number of items in your shop: ");
        int num = input.nextInt();
        input.nextLine();
        BookShop firstShop = new BookShop(num);
        // Add items to shop
        for (int i = 0; i < firstShop.getShopSize(); i++) {
            System.out.println("Enter the name: ");
            String name = input.nextLine();
            System.out.println("Name: " + name);
            System.out.println("Enter the price");
            double cost = input.nextDouble();
            input.nextLine();
            System.out.println("Price: " + cost);
            System.out.println("Enter the descripion");
            String description = input.nextLine();
            System.out.println("Description: " + description);
            firstShop.addBook(i,name,cost,description);
        }
        //Work with client.Here we show our catalog
        System.out.println("Here you can see our catalog");
        firstShop.printAllNames();
        firstShop.getAllDescriptions();
        System.out.println("If you like something press YES.If not - press NO.");
        String answ1 = input.nextLine();
        while (true) {
            if (answ1.equals("YES")) {
                System.out.println("How many books you wanna buy?");
                int numOfItems = input.nextInt();
                input.nextLine();
                //Making order
                Order myOrder = new Order(numOfItems);
                for (int i = 0; i < numOfItems; i++) {
                    System.out.println("Enter the name of " + (i+1) + " item");
                    String bookname = input.nextLine();
                    for (int j = 0; j < firstShop.getShopSize(); j++) {
                        if (firstShop.getBooksName(j) == bookname){
                            myOrder.append(firstShop.getItem(j));
                        }
                    }
                }
                //Starting delivering
                System.out.println("You must pay " + myOrder.getSum() + " dollars");
                System.out.println("You order is accept!Have a nice day!Bye");
                break;
            } else if (answ1.equals("NO")) {
                System.out.println("Goodbye =)");
                break;
            } else {
                System.out.println("Error.Incorrect input.Try again");
                answ1 = input.nextLine();
            }
        }
    }

}
