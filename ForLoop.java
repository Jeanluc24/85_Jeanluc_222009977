class ForLoop {
    public static void main(String args[]) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (isEven(i)) {
                System.out.println("= is an Even number");
            } else {
                System.out.println("= is not an Even number");
            }
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

}
