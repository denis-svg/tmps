from abc import ABC, abstractmethod

from online_store.domain.models.Customer import Customer, Admin

class CustomerFactory(ABC):
    @abstractmethod
    def create_customer(self, name, email):
        pass

class StandardCustomerFactory(CustomerFactory):
    def create_customer(self, name, email):
        return Customer(name, email)

class AdminCustomerFactory(CustomerFactory):
    def create_customer(self, name, email):
        return Admin(name, email)
