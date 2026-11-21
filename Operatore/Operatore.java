package Operatore;

public class Operatore {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        int c = 10;
        int d = 20;

        System.out.println(c > d);
        System.out.println(c < d);
        System.out.println(c == d);
        int age = 23;

        System.out.println(age > 18 && age < 30);
        System.out.println(age < 18 || age > 20);
        System.out.println(!(age > 18));
    }
}
