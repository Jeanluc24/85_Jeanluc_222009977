class NestedLoop {
    public static void main(String[] args) {
        int height = 5; // Height of the triangle

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}