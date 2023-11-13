package domain.factory;

import domain.models.products.Book;
import domain.models.products.Electronic;
import domain.models.products.ProductInterface;
import domain.models.products.Promotion;

public class ProductFactory {
    public ProductInterface createProduct(String productType, Object... args) {
        return switch (productType) {
            case "Book" -> this.createBook(args);
            case "Electronic" -> this.createElectronic(args);
            // Handle other product types if needed
            default -> throw new IllegalArgumentException("Unknown product type: " + productType);
        };
    }

    private ProductInterface createBook(Object[] args) {
        // Extract arguments specific to Book, assuming title and price
        String title = (String) args[0];
        float price = (Float) args[1];
        Promotion promotion = (Promotion) args[2];
        // Add other Book-specific arguments as needed

        return (ProductInterface) new Book(title, price, promotion);
    }

    private ProductInterface createElectronic(Object[] args) {
        // Extract arguments specific to Electronic, assuming model and price
        String model = (String) args[0];
        float price = (Float) args[1];
        Promotion promotion = (Promotion) args[2];
        // Add other Electronic-specific arguments as needed

        return (ProductInterface) new Electronic(model, price, promotion);
    }
}