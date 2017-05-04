package PetProject;


import java.util.ArrayList;

public class ConsoleShopInterfase {


    public void showAllProducts(Container container) {
        for(Product product : container.getAllProducts()){
            System.out.println(product.getName());
        }
    }

    public void addProductToBasket(Product product, Basket basket, int howMuch) {
        basket.getMyBasket().put(product.getId(), howMuch);
    }

    public void showProductsInBasket(Basket basket) {

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
            basket.getMyBasket().put(product.getId(),howMany + tmp);
            return;
        }
        basket.getMyBasket().put(product.getId(), howMany);
    }


    public ArrayList<Product> getLastFiveProducts(Basket basket) {
        return null;
    }
}
