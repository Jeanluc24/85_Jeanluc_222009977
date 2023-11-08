// Interface for payment methods
interface PaymentMethod {
  // Declare method to make a payment
  boolean makePayment(double amount);

  // Declare method to get the account balance
  double getBalance();
}

// Card class implementing the PaymentMethod interface
class Card implements PaymentMethod {
  // Private field to store the card number
  private int cardNumber;

  // Private field to store the account balance
  private double balance;

  // Constructor to initialize the card number and initial balance
  public Card(int cardNumber, double initialBalance) {
    this.cardNumber = cardNumber;
    this.balance = initialBalance;
  }

  // Implement the getBalance() method to return the account balance
  @Override
  public double getBalance() {
    return balance;
  }

  // Implement the makePayment() method to process payments
  @Override
  public boolean makePayment(double amount) {
    if (amount > 0 && balance >= amount) {
      balance -= amount;
      System.out.println("Payment of $" + amount + " successful. New balance: $" + balance);
      return true;
    } else {
      System.out.println("Insufficient funds. Payment failed.");
      return false;
    }
  }
}

// Main class to demonstrate the Tap & Go system
public class Inheritance2 {
  public static void main(String[] args) {
    // Create two Card objects representing different cards
    PaymentMethod card1 = new Card(123456789, 100.0);
    PaymentMethod card2 = new Card(987654321, 50.0);

    // Display the initial balances of both cards
    System.out.println("Card 1 balance: $" + card1.getBalance());
    System.out.println("Card 2 balance: $" + card2.getBalance());

    // Make payments using the makePayment() method
    System.out.println("Making payments:");
    card1.makePayment(25.0);
    card2.makePayment(40.0);
    card1.makePayment(80.0);

    // Display the updated balances of both cards
    System.out.println("Updated balances:");
    System.out.println("Card 1 balance: $" + card1.getBalance());
    System.out.println("Card 2 balance: $" + card2.getBalance());
  }
}
