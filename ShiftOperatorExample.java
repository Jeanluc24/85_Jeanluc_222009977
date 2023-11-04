class ShiftOperatorExample {
    public static void main(String args[]) {
        // Right Shift Operator (>>): Shifts the bits to the right while maintaining the sign.

        // Positive number 20 in binary: 00010100
        // Shifting 2 bits to the right: 00000101 (in decimal, it's 5)
        System.out.println(20 >> 2);  // Prints 5

        // Unsigned Right Shift Operator (>>>): Shifts the bits to the right, filling with zeros.

        // Positive number 20 in binary: 00010100
        // Shifting 2 bits to the right: 00000101 (in decimal, it's 5)
        System.out.println(20 >>> 2);  // Prints 5

        // Negative number -20 in binary: 11101100 (in two's complement)
        // Shifting 2 bits to the right: 11111011 (in decimal, it's -5)
        System.out.println(-20 >> 2);  // Prints -5

        // Negative number -20 in binary: 11101100 (in two's complement)
        // Shifting 2 bits to the right: 001111111111111111111111111111 (in decimal, it's 1073741819)
        System.out.println(-20 >>> 2);  // 1073741819
    }
}

}
