package domain.models;

import domain.models.products.ProductInterface;

public class Order {
    CustomerInterface customer;
    PaymentOptionInterface payment_gateway;
    public Order(CustomerInterface customer, PaymentOptionInterface payment_gateway){
        this.customer = customer;
        this.payment_gateway = payment_gateway;
    }
    public String generateSummary(Catalog catalog){
        float total_price = this.customer.getShoppingCart().calculateTotalPrice();
        if (total_price == 0){
            return "Shopping Cart is empty";
        }
        if (this.payment_gateway.processPayment(total_price)){
            for(ProductInterface item : this.customer.getShoppingCart().getItems()){
                catalog.remove_item(item);
            }
            this.customer.getShoppingCart().clear();
            return "Payment succesful";
        }
        return "Payment processing failed.";
    }
}
