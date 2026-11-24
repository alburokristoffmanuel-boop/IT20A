// Parent Class
class PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing general payment of $" + amount);
    }
}

// Child Class 1
class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing $" + amount + " payment using Credit Card. Charging small processing fee.");
    }
}

// Child Class 2
class PayPal extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing $" + amount + " payment via PayPal account securely.");
    }
}

// Child Class 3
class CashOnDelivery extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing $" + amount + " payment via Cash on Delivery upon item arrival.");
    }
}

// Main Class
public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("=== POLYMORPHISM DEMONSTRATION ===");

        // Paggamit sa parent-class references aron pagtawag sa overridden methods
        PaymentMethod payment1 = new CreditCard();
        PaymentMethod payment2 = new PayPal();
        PaymentMethod payment3 = new CashOnDelivery();

        payment1.processPayment(150.00);
        payment2.processPayment(75.50);
        payment3.processPayment(300.00);
    }
}