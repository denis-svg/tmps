package domain.models;

import domain.models.products.ProductBundle;
import domain.models.products.ProductInterface;

import java.util.List;

public class Customer implements CustomerInterface{
    private String name;
    private String email;
    public ShoppingCartInterface shopping_cart;

    public Customer(String name, String email, ShoppingCartInterface sc){
        this.name = name;
        this.email = email;
        this.shopping_cart = sc;
    }
    @Override
    public boolean checkItemInCatalog(Catalog catalog, ProductInterface item) {
        return catalog.search_item(item) != null;
    }

    @Override
    public void addItemToCart(Catalog catalog, ProductInterface item) {
        if(this.checkItemInCatalog(catalog, item)){
            this.shopping_cart.add_item(item);
            System.out.println(this.name + ":" + this.email + " has added in his/hers shopping cart " +
                    item.getTitle() + ":" + System.identityHashCode(item));
            return;
        }else if (item instanceof ProductBundle){
            System.out.println(System.identityHashCode(item) + ":" + item.getTitle() + " is being added to shopping cart");
            ProductBundle bundle = (ProductBundle) item;
            List<ProductInterface> bundleItems = bundle.getItems();
            for(ProductInterface bit : bundleItems){
                this.addItemToCart(catalog, bit);
            }
            return;
        }
        System.out.println(System.identityHashCode(item) + ":" + item.getTitle() + " is not in the catalog:"+System.identityHashCode(catalog));
    }

    @Override
    public ShoppingCartInterface getShoppingCart(){
        return this.shopping_cart;
    }
}
