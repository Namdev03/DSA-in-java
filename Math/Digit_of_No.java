package Math;

public class Digit_of_No {

    static void printdigits(int num) {

        while (num != 0) {

            int rem = num % 10;

            System.out.println(rem);

            num = num / 10;
        }
    }

    public static void main(String[] args) {

        int n = 53127;

        printdigits(n);
    }
}