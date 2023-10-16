from online_store.domain.models.products.Book import Book
from online_store.domain.models.products.ProductInterface import ProductInterface
from online_store.domain.models.products.Electronic import Electronic
    
class ProductFactory:
    def create_product(self, product_type, *args, **kwargs) -> ProductInterface:
        if product_type == "Book":
            return Book(*args, **kwargs)
        elif product_type == "Electronic":
            return Electronic(*args, **kwargs)