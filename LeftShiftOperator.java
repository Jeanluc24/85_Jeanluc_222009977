class LeftShiftOperator {
    public static void main(String args[]) {
        // Left Shift Operator (<<) shifts the bits of a number to the left.
        
        // 10 in binary: 1010
        // Shifting 2 bits to the left: 101000 (in decimal, it's 40)
        System.out.println(10 << 2);  // Prints 40

        // 10 in binary: 1010
        // Shifting 3 bits to the left: 1010000 (in decimal, it's 80)
        System.out.println(10 << 3);  // Prints 80

        // 20 in binary: 10100
        // Shifting 2 bits to the left: 1010000 (in decimal, it's 80)
        System.out.println(20 << 2);  // Prints 80

        // 15 in binary: 1111
        // Shifting 4 bits to the left: 11110000 (in decimal, it's 240)
        System.out.println(15 << 4);  // Prints 240
    }
}
