package Math;

public class reverse {
    public static void main(String[] args) {
        int n = 2654562;
        int num =n;
        int rev = 0;
        while (n!=0) {
            int rem = n%10;
            rev=rev*10+rem;
            // System.out.print(rem);
            n=n/10;
        }
        if(num==rev){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("this no. is not palindrom");
        }
        System.out.println(rev);
    }
}
