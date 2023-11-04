public class MrBob {
    // Method to calculate simple interest
    public double SimpleInterest(double Principle, double Rate, double Time) {
        // Calculate and return the simple interest using the provided formula.
        return (Principle * Rate * Time) / 100;
    }

    public static void main(String args[]) {
        // Create an instance of the MrBob class.
        MrBob bob = new MrBob();

        // Calculate simple interest with specified parameters using the SimpleInterest method.
        double interest = bob.SimpleInterest(100000, 5, 5);

        // Print information about the calculation and the result.
        System.out.println("The principle amount: 100,000 Rwandan Francs");
        System.out.println("The Rate: 5%");
        System.out.println("Number of years: 5 years");
        System.out.println("The simple interest is " + interest + " Rwandan Francs");
    }
}
