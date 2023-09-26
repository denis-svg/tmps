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