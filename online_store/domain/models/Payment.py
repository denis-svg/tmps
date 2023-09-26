from abc import ABC, abstractmethod

class PaymentOptionInterface(ABC):
    @abstractmethod
    def process_payment(self, amount: float) -> bool:
        pass

class VisaPayment(PaymentOptionInterface):
    def process_payment(self, amount: float) -> bool:
        # Implementation for processing Visa payments securely
        return True

class MasterCardPayment(PaymentOptionInterface):
    def process_payment(self, amount: float) -> bool:
        # Implementation for processing MasterCard payments securely
        return True

# You can add more payment option classes as needed
