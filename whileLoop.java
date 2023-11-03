public class whileLoop {
    public static void main(String args[]) {
        int num = 1;
       

        while (num <= 10) {
            if (isPrime(num)) {
                System.out.println(num); 
                ;
            }
            num++;
         }
     }
  public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
