package domain.models;

import domain.models.products.ProductInterface;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private static Catalog instance = null;
    private final List<ProductInterface> items;

    private Catalog() {
        this.items = new ArrayList<>();
    }

    public static Catalog getInstance() {
        if (instance == null) {
            instance = new Catalog();
        }
        return instance;
    }

    public void add_item(ProductInterface item) {
        this.items.add(item);
    }

    public ProductInterface search_item(ProductInterface new_item) {
        for (ProductInterface item : this.items) {
            if (item.equals(new_item)) {
                return item;
            }
        }
        return null;
    }

    public void remove_item(ProductInterface item) {
        this.items.remove(item);
        System.out.println("Removing " + item + " from catalog");
    }
}
