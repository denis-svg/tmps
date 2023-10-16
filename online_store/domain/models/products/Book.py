from online_store.domain.models.products.ProductInterface import ProductInterface

class Book(ProductInterface):
    def __init__(self, title: str, author: str, price: float) -> None:
        self.title = title
        self.author = author
        self.price = price

    def getPrice(self) -> float:
        return self.price
    
    def modifyPrice(self, new_price:float):
        self.price = new_price

    def getTitle(self) -> str:
        return self.title
    
    def clone(self):
        return Book(self.title, self.author, self.price)
    
    def __str__(self):
        return f"{self.title} by {self.author} - Price: ${self.price:.2f}"