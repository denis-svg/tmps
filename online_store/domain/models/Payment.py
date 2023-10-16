from abc import ABC, abstractmethod

class PaymentOptionInterface(ABC):
    @abstractmethod
    def process_payment(self, amount: float) -> bool:
        pass

class VisaPayment(PaymentOptionInterface):
    def __init__(self, card_number: str, card_holder: str, expiration_date: str, cvv: str):
        self.card_number = card_number
        self.card_holder = card_holder
        self.expiration_date = expiration_date
        self.cvv = cvv

    def process_payment(self, amount: float) -> bool:
        print(f"Processing Visa payment of ${amount} for {self.card_holder}")
        return True

class MasterCardPayment(PaymentOptionInterface):
    def __init__(self, card_number: str, card_holder: str, expiration_date: str, cvv: str):
        self.card_number = card_number
        self.card_holder = card_holder
        self.expiration_date = expiration_date
        self.cvv = cvv

    def process_payment(self, amount: float) -> bool:
        print(f"Processing MasterCard payment of ${amount} for {self.card_holder}")
        return True

class PaymentOptionBuilder(ABC):
    @abstractmethod
    def build(self) -> PaymentOptionInterface:
        pass

class VisaPaymentBuilder(PaymentOptionBuilder):
    def __init__(self):
        self.card_number = ""
        self.card_holder = ""
        self.expiration_date = ""
        self.cvv = ""

    def set_card_number(self, card_number):
        self.card_number = card_number
        return self

    def set_card_holder(self, card_holder):
        self.card_holder = card_holder
        return self

    def set_expiration_date(self, expiration_date):
        self.expiration_date = expiration_date
        return self

    def set_cvv(self, cvv):
        self.cvv = cvv
        return self

    def build(self) -> VisaPayment:
        return VisaPayment(self.card_number, self.card_holder, self.expiration_date, self.cvv)

class MasterCardPaymentBuilder(PaymentOptionBuilder):
    def __init__(self):
        self.card_number = ""
        self.card_holder = ""
        self.expiration_date = ""
        self.cvv = ""

    def set_card_number(self, card_number):
        self.card_number = card_number
        return self

    def set_card_holder(self, card_holder):
        self.card_holder = card_holder
        return self

    def set_expiration_date(self, expiration_date):
        self.expiration_date = expiration_date
        return self

    def set_cvv(self, cvv):
        self.cvv = cvv
        return self

    def build(self) -> MasterCardPayment:
        return MasterCardPayment(self.card_number, self.card_holder, self.expiration_date, self.cvv)