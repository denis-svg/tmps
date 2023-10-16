from online_store.domain.models.Catalog import Catalog
class Order:
    def __init__(self, customer, payment_gateway):
        self.customer = customer
        self.payment_gateway = payment_gateway

    def generate_order_summary(self, catalog:Catalog) -> str:
        # Calculate the total price of items in the order
        total_price = self.customer.shopping_cart.calculateTotalPrice()
        if total_price is None:
            return "Shopping Cart is empty"
        # Process payment with the selected payment gateway
        if self.payment_gateway.process_payment(total_price):
            for item in self.customer.shopping_cart.items:
                catalog.remove_item(item)
            self.customer.clear_cart()
            return "Payment succesful"
        else:
            return "Payment processing failed."