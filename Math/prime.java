package Math;

public class prime {
    public static void main(String[] args) {
        int n = 8;
        boolean c = true;
        if (n <= 1) {
            c = false;
        } else {
            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0) {
                    c = false;
                    break;
                }
            }
        }
        if (c) {
            System.out.println("this no. is prime No.");
        }
        else{
            System.out.println("this no. is not prime no");
        }
    }
}
