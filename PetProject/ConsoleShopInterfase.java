package PetProject;


import java.util.ArrayList;
import java.util.Enumeration;

public class ConsoleShopInterfase {


    public void showAllProducts(Container container) {
        for(Product product : container.getAllProducts()){
            System.out.println(product.getName());
        }
    }

    public void addProductToBasket(Product product, Basket basket, int howMuch) {
        basket.getMyBasket().put(product.getPartNumber(), howMuch);
    }

    public void showProductsInBasket(Basket basket) {
        Enumeration<Long> element = basket.getMyBasket().keys();
        while( element.hasMoreElements()){
            Long myElement = element.nextElement();
            System.out.println("Product id is " + myElement + " in mumber of  " + basket.getMyBasket().get(myElement));
        }
    }


    public void buy(Basket basket, Product product, int howMany) {
        if(basket == null || product == null){
            System.out.println("Something go wrong.NullPoenterExeption");
            return;
        }
        if (howMany < 0){
            System.out.println("Error.Field howmany must be > 0");
            return;
        }
        if(basket.getMyBasket().containsValue(product.getDescription())){
            int tmp = basket.getMyBasket().get(product.getDescription());
            basket.getMyBasket().remove(product.getDescription());
            basket.getMyBasket().put(product.getPartNumber(),howMany + tmp);
            return;
        }
        basket.getMyBasket().put(product.getPartNumber(), howMany);
    }


    public ArrayList<Product> getLastFiveProducts(Basket basket) {
        return null;
    }
}
