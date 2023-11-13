package domain.models;

import domain.models.products.ProductInterface;

public interface CustomerInterface {
    boolean checkItemInCatalog(Catalog catalog, ProductInterface item);
    void addItemToCart(Catalog catalog, ProductInterface item);

    ShoppingCartInterface getShoppingCart();
}