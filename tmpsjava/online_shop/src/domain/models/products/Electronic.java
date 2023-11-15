package domain.models.products;

import java.util.ArrayList;
import java.util.List;

public class Electronic implements ProductInterface{
    final private String title;
    private float price;

    private Promotion promotion;

    private List<Observer> observers;

    public Electronic(String title, float price, Promotion promotion){
        this.title = title;
        this.price = price;
        this.promotion = promotion;
        this.observers = new ArrayList<>();
    }

    @Override
    public float getPrice() {
        return this.promotion.applyDiscount(this.price);
    }

    @Override
    public void modifyPrice(float new_price) {
        this.price = new_price;
        notifyObservers("Price changed: $" + new_price);
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public ProductInterface copy() {
        return (ProductInterface) new Book(this.title, this.price, this.promotion);
    }

    @Override
    public Promotion getPromotion() {
        return promotion;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(this.title, message);
        }
    }
}
