package Loop;

public class Forloop {
    public static void main(String[] args) {
      
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
        for (int i = 0; i <=10; i+=2) {
            System.out.println(i);//0,2,4,6,8,10
        }
        int age= 20;
        while (age<=30) {
            System.out.println(age);
            age++;
        }
    }
}
