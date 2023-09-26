from online_store.domain.models.products.ProductInterface import ProductInterface

class Electronic(ProductInterface):
    def __init__(self, name: str, brand: str, price: float):
        self.name = name
        self.brand = brand
        self.price = price

    def getPrice(self) -> float:
        return self.price
    
    def modifyPrice(self, new_price:float):
        self.price = new_price

    def getTitle(self) -> str:
        return self.name