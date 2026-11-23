package Math;

public class Count {
    static int countdigit(int num){
       int count = 0;
       while (num !=0 ) {
        int rem = num  % 10;
        count++;
        num = num/10;
       } 
       return count;
    }
    public static void main(String[] args) {
        int num = 23048;
        System.out.println(countdigit(num));
    }
}
