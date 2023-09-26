from online_store.domain.models.products.ProductInterface import ProductInterface
from online_store.domain.models.Catalog import Catalog

class ShoppingCart:
    def __init__(self):
        self.items = []

    def add_item(self, item:ProductInterface):
        self.items.append(item)

    def remove_item(self, item:ProductInterface):
        self.items.remove(item)

    def calculateTotalPrice(self) -> float:
        if not self.items:
            return None
        total_price = sum(item.getPrice() for item in self.items)
        return total_price