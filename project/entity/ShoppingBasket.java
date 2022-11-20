package warehouse.project.entity;

import java.util.List;

public class ShoppingBasket {

    private List<Product> products;

    public ShoppingBasket() {

    }

    public ShoppingBasket(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
