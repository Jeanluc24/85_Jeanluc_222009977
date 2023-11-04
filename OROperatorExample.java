class OROperatorExample {
    public static main(String args[]) {
        // Declare three integer variables 'a', 'b', and 'c' with values 10, 5, and 20, respectively.
        int a = 10;
        int b = 5;
        int c = 20;

        // Use the logical OR operator '||' to combine conditions and evaluate short-circuit behavior.

        // Operation 1: (a > b) is true (10 is greater than 5), so the second condition (a < c) is not evaluated.
        // Result: true, and 'a' is not incremented.
        System.out.println(a > b || a < c);  // Prints "true"

        // Use the bitwise OR operator '|' to perform two separate OR operations, not short-circuiting.

        // Operation 2: (a > b) is true (10 is greater than 5) and (a < c) is evaluated.
        // Result: true, and 'a' is not incremented at this stage.
        System.out.println(a > b | a < c);  // Prints "true"

        // Operation 3: (a > b) is true (10 is greater than 5), so the second condition (a++ < c) is not evaluated.
        // Result: true, and 'a' is not incremented.
        System.out.println(a > b || a++ < c);  // Prints "true"

        // 'a' remains unchanged at this point.
        System.out.println(a);  // Prints "10"

        // Operation 4: (a > b) is true (10 is greater than 5) and (a++ < c) is evaluated.
        // Result: true, and 'a' is incremented to 11 after this operation.
        System.out.println(a > b | a++ < c);  // Prints "true"

        // 'a' has been incremented to 11 after Operation 4.
        System.out.println(a);  // Prints "11"
    }
}
