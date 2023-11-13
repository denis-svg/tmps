package client;

import domain.factory.ProductFactory;
import domain.models.*;
import domain.models.notifications.EmailNotificationService;
import domain.models.notifications.NotificationAdapter;
import domain.models.notifications.PushNotificationService;
import domain.models.notifications.SMSNotificationService;
import domain.models.products.*;

public class ClientUI {
    public static void main(String[] args){
        System.out.println("Welcome to our online shop");
        ProductFactory p_factory = new ProductFactory();

        Book book1 = (Book)p_factory.createProduct("Book", "Musk Biography", 100.00f, new FixedAmountDiscount(20f));
        Book book2 = (Book)p_factory.createProduct("Book", "rich dad", 100.00f, new PercentageDiscount(10));
        Book book3 = (Book) book1.copy();

        Electronic electronic1 = (Electronic) p_factory.createProduct("Electronic", "iphone", 120.00f, new FixedAmountDiscount(20f));

        Catalog catalog = Catalog.getInstance();
        Admin admin1 = new Admin("Ion", "ion@gmail.com", new ShoppingCart());
        admin1.addItemToCatalog(catalog, book1);
        admin1.addItemToCatalog(catalog, book2);
        admin1.addItemToCatalog(catalog, electronic1);

        Customer customer = new Customer("Ion", "ion@gmail.com", new ShoppingCart());
        //customer.addItemToCart(catalog, electronic1);
        //customer.addItemToCart(catalog, book3);
        //customer.addItemToCart(catalog, book2);
        ProductBundle books = new ProductBundle();
        books.addProduct(book1);
        books.addProduct(book2);
        books.addProduct(book1.copy());
        customer.addItemToCart(catalog, books);
        PaymentOptionBuilder visaBuilder = new VisaPaymentBuilder()
                .setCardNumber("1234-5678-9012-3456")
                .setCardHolder("John Doe")
                .setExpirationDate("12/23")
                .setCvv("123");
        PaymentOptionInterface visaPayment = visaBuilder.build();
        Order order1 = new Order(customer, visaPayment);
        System.out.println(order1.generateSummary(catalog));

        EmailNotificationService emailService = new EmailNotificationService();
        SMSNotificationService smsService = new SMSNotificationService();
        PushNotificationService pushService = new PushNotificationService();
        NotificationAdapter notificationAdapter = new NotificationAdapter(emailService, smsService, pushService);
        // Send notifications using the common interface
        notificationAdapter.sendNotification("Hello, this is an email notification.", "user@example.com");
        notificationAdapter.sendNotification("Greetings, this is an SMS notification.", "1234567890");
        notificationAdapter.sendNotification("Welcome, this is a push notification.", "deviceToken123");

    }
}
