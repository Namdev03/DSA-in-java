package Math;

public class digitsofNumber {
    static int sumOfDigit(int num){
        int sum=0;
        while(num !=0){
            int rem = num%10;
            sum+=rem;
             num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n= 23453;
        int ans = sumOfDigit(n);
        System.out.println(ans);
    }
}
