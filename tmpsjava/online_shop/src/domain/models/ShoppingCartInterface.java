package domain.models;

import domain.models.products.ProductInterface;

import java.util.List;

public interface ShoppingCartInterface {
    public void add_item(ProductInterface item);
    public void remove_item(ProductInterface item);
    public Float calculateTotalPrice();

    public List<ProductInterface> getItems();

    public void clear();

    ShoppingCartMemento saveToMemento();

    void restoreFromMemento(ShoppingCartMemento memento);
}
