from online_store.domain.models.products.ProductInterface import ProductInterface

class Catalog:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(Catalog, cls).__new__(cls)
            cls._instance.items = []
        return cls._instance

    def add_item(self, item: ProductInterface):
        self.items.append(item)

    def search_item(self, sitem: ProductInterface) -> ProductInterface:
        for item in self.items:
            if item == sitem:
                return item
            
        return None
    
    def remove_item(self, item:ProductInterface):
        self.items.remove(item)
        print(f"Removing {item} from catalog")