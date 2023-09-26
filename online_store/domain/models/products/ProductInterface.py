from abc import ABC, abstractmethod

class ProductInterface(ABC):
    @abstractmethod
    def getPrice(self) -> float:
        pass

    @abstractmethod
    def modifyPrice(self, new_price:float) -> float:
        pass

    @abstractmethod
    def getTitle(self) -> str:
        pass
