from online_store.domain.models.ShoppingCart import ShoppingCart
from online_store.domain.models.Catalog import Catalog
from online_store.domain.models.products.ProductInterface import ProductInterface
from abc import ABC, abstractmethod

class CustomerInterface(ABC):
    @abstractmethod
    def check_item_in_catalog(self, catalog, title):
        pass

    @abstractmethod
    def add_item_to_cart(self, cart, item):
        pass

class AdminInterface(ABC):
    @abstractmethod
    def add_item_to_catalog(self, catalog, item: ProductInterface):
        pass


class Customer(CustomerInterface):
    def __init__(self, name: str, email: str):
        self.name = name
        self.email = email
        self.shopping_cart = ShoppingCart()

    def check_item_in_catalog(self, catalog: Catalog, item):
        return catalog.search_item(item) is not None

    def add_item_to_cart(self, catalog: Catalog, item):
        if self.check_item_in_catalog(catalog, item):
            self.shopping_cart.add_item(item)
            catalog.remove_item(item)
            return f"Item added"
        return f"Item does not exist"
    
    def clear_cart(self):
        self.shopping_cart.items = []

class Admin(AdminInterface):
    def __init__(self, name: str, email: str):
        self.name = name
        self.email = email

    def add_item_to_catalog(self, catalog:Catalog, item: ProductInterface):
        catalog.add_item(item)