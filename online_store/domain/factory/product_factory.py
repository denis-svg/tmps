from abc import ABC, abstractmethod

from online_store.domain.models.products import Book, Electronic

class ProductFactory(ABC):
    @abstractmethod
    def create_product(self, **kwargs):
        pass

class BookFactory(ProductFactory):
    def create_product(self, title, author, price):
        # Create and return an instance of the Book class
        return Book.Book(title, author, price)

class ElectronicsFactory(ProductFactory):
    def create_product(self, name, brand, price):
        # Create and return an instance of the Electronics class
        return Electronic.Electronic(name, brand, price)