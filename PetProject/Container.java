package PetProject;


import java.util.ArrayList;

public class Container {

    private ArrayList<Product> allProducts;

    public Container(ArrayList<Product> allProducts) {
        this.allProducts = allProducts;
    }

    public ArrayList<Product> getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(ArrayList<Product> allProducts) {
        this.allProducts = allProducts;
    }

    public int getSize(){
        return allProducts.size();
    }

}
