class UnaryOperatorExample {
    public static void main(String args[]) {
        // Declare integer variables 'a' and 'b' with values 10 and -10, respectively.
        int a = 10;
        int b = -10;

        // Declare boolean variables 'c' and 'd' with the values true and false, respectively.
        boolean c = true;
        boolean d = false;

        // Use the bitwise NOT operator (~) to invert the bits of 'a' and 'b'.
        System.out.println(~a);  // Prints the bitwise NOT of 'a'.
        System.out.println(~b);  // Prints the bitwise NOT of 'b'.

        // Use the logical NOT operator (!) to negate the boolean values of 'c' and 'd'.
        System.out.println(!c);  // Prints the logical NOT of 'c'.
        System.out.println(!d);  // Prints the logical NOT of 'd'.
    }
}
