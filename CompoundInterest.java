// Define the Loan class
class Loan {
    // Declare instance variables
    double principal;        // The principal amount of the loan
    double rate;             // The annual interest rate
    double time;             // The number of years
    double numberOftimes;    // The number of times interest is compounded per year

    // Constructor for the Loan class
    public Loan(double principal, double rate, double time, double numberOftimes) {
        // Initialize the instance variables with the provided values
        this.principal = principal;
        this.rate = rate / 100;         // Convert the rate to a decimal
        this.time = time;
        this.numberOftimes = numberOftimes;
    }

    // Method to calculate the total amount to be paid
    public double Amount() {
        return principal * Math.pow(1 + (rate / numberOftimes), numberOftimes * time);
    }
}

// Main class for calculating compound interest
public class CompoundInterest {
    public static void main(String[] args) {
        // Create an instance of the Loan class with specified parameters
        Loan loan = new Loan(500000, 18, 3, 12);
        
        // Calculate the total amount to be paid
        double total = loan.Amount();

        // Print information about the loan and the calculated total
        System.out.println("Principal Amount: 500000 Rwandan Francs");
        System.out.println("Annual Interest Rate: 18%");
        System.out.println("Number of Years: 3");
        System.out.println("Total Interest Paid After 3 Years: " + total + " Rwandan Francs");
    }
}
