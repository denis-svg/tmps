package domain.models.products;

// Observer interface
public interface Observer {
    void update(String productName, String message);
}