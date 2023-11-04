class NestedForLoop {
    public static void main(String[] args) {
        // Initialize a variable 'num' with the value 1.
        int num = 1;

        // Outer loop: Iterate three times to create rows.
        for (int i = 1; i <= 3; i++) {
            // Inner loop: Iterate three times to create columns.
            for (int j = 1; j <= 3; j++) {
                // Print the current value of 'num' followed by a space.
                System.out.print(num + " ");
                
                // Increment 'num' to the next value.
                num++;
            }
            
            // Move to a new line after each row.
            System.out.println();
        }
    }
}
