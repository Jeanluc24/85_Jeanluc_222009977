class IfElse {
    public static void main(String args[]) {
        int number = 22;

        if (number < -10) {
            System.out.println("Negative");
        } else if (number >= -10 && number < 0) {
            System.out.println("Cold");
        } else if (number >= 0 && number < 10) {
            System.out.println("Cool");
        } else if (number >= 10 && number < 20) {
            System.out.println("Positive");
        } else if (number >= 20 && number < 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Invalid number");
        }
    }
}
