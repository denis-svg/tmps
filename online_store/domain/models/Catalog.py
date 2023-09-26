from online_store.domain.models.products.ProductInterface import ProductInterface

class Catalog:
    def __init__(self):
        self.items = []

    def add_item(self, item: ProductInterface):
        self.items.append(item)

    def search_item(self, sitem: ProductInterface) -> ProductInterface:
        for item in self.items:
            if item == sitem:
                return item
            
        return None
    
    def remove_item(self, item:ProductInterface):
        self.items.remove(item)