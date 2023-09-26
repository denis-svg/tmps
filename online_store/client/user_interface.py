from online_store.domain.factory.customer_factory import StandardCustomerFactory, AdminCustomerFactory
from online_store.domain.factory.product_factory import BookFactory, ElectronicsFactory
from online_store.domain.models.Order import Order
from online_store.domain.models.Catalog import Catalog
from online_store.domain.models.Payment import VisaPayment, MasterCardPayment

def main():
    print("Welcome to the Online Bookstore!")

    catalog = Catalog()

    # Create product instances using the product factories
    book_factory = BookFactory()
    electronics_factory = ElectronicsFactory()

    # Create customer instances using the customer factories
    standard_customer_factory = StandardCustomerFactory()
    admin_customer_factory = AdminCustomerFactory()

    standard_customer = standard_customer_factory.create_customer("Buyer User", "buyer@example.com")
    admin_customer = admin_customer_factory.create_customer("Admin User", "admin@example.com")

    # Adding some items by the admin
    book = book_factory.create_product("Book Title", "Author", 29.99)
    laptop = electronics_factory.create_product("Laptop", "Dell", 999.99)
    admin_customer.add_item_to_catalog(catalog, laptop)
    admin_customer.add_item_to_catalog(catalog, book)

    # Add items to the shopping cart
    result = standard_customer.add_item_to_cart(catalog, laptop)
    print(result)

    # Create payment options
    visa_payment = VisaPayment()
    mastercard_payment = MasterCardPayment()

    # Create orders and generate order summaries
    user_order = Order(standard_customer, visa_payment)

    summary = user_order.generate_order_summary()
    print(summary)