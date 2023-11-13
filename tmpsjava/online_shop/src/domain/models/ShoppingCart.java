package domain.models;

import domain.models.products.ProductInterface;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements ShoppingCartInterface {
    private List<ProductInterface> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void add_item(ProductInterface item) {
        this.items.add(item);
    }

    public void remove_item(ProductInterface item) {
        this.items.remove(item);
    }
    @Override
    public Float calculateTotalPrice() {
        if (this.items.isEmpty()) {
            return 0.0f;
        }

        float total_price = 0;
        for (ProductInterface item : this.items) {
            total_price += item.getPrice();
        }
        return total_price;
    }

    @Override
    public List<ProductInterface> getItems() {
        return this.items;
    }

    public void clear(){
        this.items = new ArrayList<>();
    }

}
