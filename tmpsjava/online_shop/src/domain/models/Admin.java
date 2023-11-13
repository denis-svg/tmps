package domain.models;

import domain.models.products.ProductInterface;

public class Admin extends Customer{
    public Admin(String name, String email, ShoppingCartInterface sp){
        super(name, email, sp);
    }

    public void addItemToCatalog(Catalog catalog, ProductInterface item){
        catalog.add_item(item);
        System.out.println("Item:" + System.identityHashCode(item) +
                " has been added to catalog:" + System.identityHashCode(catalog));
    }
}
