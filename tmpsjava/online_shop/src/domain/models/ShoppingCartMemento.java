package domain.models;

import domain.models.products.ProductInterface;

import java.util.ArrayList;
import java.util.List;

// Memento
public class ShoppingCartMemento {
    private List<ProductInterface> items;

    public ShoppingCartMemento(List<ProductInterface> items) {
        this.items = new ArrayList<>(items);
    }

    public List<ProductInterface> getItems() {
        return new ArrayList<>(items);
    }
}