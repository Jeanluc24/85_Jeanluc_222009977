public class whileLoop {
    public static void main(String args[]) {
        // Initialize an integer variable 'num' with the value 1.
        int num = 1;

        // Start a while loop that continues as long as 'num' is less than or equal to 10.
        while (num <= 10) {
            // Check if the current 'num' is prime by calling the 'isPrime' function.
            if (isPrime(num)) {
                // If 'num' is prime, print it to the console.
                System.out.println(num);
            }

            // Increment 'num' by 1 for the next iteration.
            num++;
        }
    }

    // Define a function 'isPrime' that checks whether a given number is prime.
    public static boolean isPrime(int num) {
        // Check if the number is less than or equal to 1; such numbers are not prime.
        if (num <= 1) {
            return false;
        }

        // Check for divisibility by numbers from 2 up to one less than 'num'.
        for (int i = 2; i < num; i++) {
            // If 'num' is divisible by 'i', it is not prime; return false.
            if (num % i == 0) {
                return false;
            }
        }

        // If 'num' is not divisible by any number in the loop, it is prime; return true.
        return true;
    }
}
