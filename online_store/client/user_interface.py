from online_store.domain.factory.customer_factory import StandardCustomerFactory, AdminCustomerFactory
from online_store.domain.factory.product_factory import ProductFactory
from online_store.domain.models.Order import Order
from online_store.domain.models.Catalog import Catalog
from online_store.domain.models.Payment import VisaPaymentBuilder, MasterCardPaymentBuilder

def main():
    print("Welcome to the Online Bookstore!")

    catalog = Catalog()
    factory = ProductFactory()

    # Create customer instances using the customer factories
    standard_customer_factory = StandardCustomerFactory()
    admin_customer_factory = AdminCustomerFactory()

    standard_customer = standard_customer_factory.create_customer("Buyer User", "buyer@example.com")
    admin_customer = admin_customer_factory.create_customer("Admin User", "admin@example.com")

    # Adding some items by the admin
    book1 = factory.create_product("Book", "rich dad", "elon musk", 29.99)
    book2 = book1.clone()
    book3 = book1.clone()
    phone = factory.create_product("Electronic", "Phone", "Iphone", 199.99)

    admin_customer.add_item_to_catalog(catalog, phone)
    admin_customer.add_item_to_catalog(catalog, book1)
    admin_customer.add_item_to_catalog(catalog, book2)
    admin_customer.add_item_to_catalog(catalog, book3)

    # Add items to the shopping cart
    standard_customer.add_item_to_cart(catalog, phone)

    # Create payment options
    visa_builder = VisaPaymentBuilder()
    visa_payment = visa_builder.set_card_number("1234 5678 9012 3456") \
                          .set_card_holder("John Doe") \
                          .set_expiration_date("12/25") \
                          .set_cvv("123") \
                          .build()

    # Using MasterCardPaymentBuilder
    mastercard_builder = MasterCardPaymentBuilder()
    mastercard_payment = mastercard_builder.set_card_number("5555 5555 5555 5555") \
                                      .set_card_holder("Jane Smith") \
                                      .set_expiration_date("11/24") \
                                      .set_cvv("456") \
                                      .build()

    # Create orders and generate order summaries
    user_order = Order(standard_customer, visa_payment)

    summary = user_order.generate_order_summary(catalog)
    print(summary)