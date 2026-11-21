
package InputValues;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
         System.out.println("Enter your no.");
        int a = sc.nextInt();

        System.out.println("This is your number: " + a);
        sc.close();
    }
}
