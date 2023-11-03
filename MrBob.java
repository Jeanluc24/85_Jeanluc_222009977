public class MrBob {
    // Method to calculate simple interest
    public double SimpleInterest(double Principle, double Rate, double Time) {
        return (Principle * Rate * Time) / 100;
    }

    public static void main(String args[]) {
        MrBob bob = new MrBob();

        // Calculate simple interest with specified parameters
        double interest = bob.SimpleInterest(100000, 5, 5);

        // Print information about the calculation and the result
        System.out.println("The principle amount: 100000 Rwandan Francs");
        System.out.println("The Rate: 5%");
        System.out.println("Number of years: 5 years");
        System.out.println("The simple interest is " + interest + " Rwandan Francs");
    }
}
