package Arrays;

public class array {
    public static void main(String[] args) {
        int arr[];
        arr= new int[5];
        int brr[]={12,23,44};
        System.out.println(brr[2]);
        for(int val:brr){
            System.out.println(val);
        }
        int sum = 0;
        for(int i=0;i<=brr.length-1;i++){
          sum+=brr[i];
        }
        System.out.println(sum);
        int[] age = {20,40,60,-5,10,28,50};
        int n = age.length;
        int maxAge = age[0];
        int minAge = age[0];
        for(int i=0;i<=n-1;i++){
            if (age[i]>maxAge) {
                maxAge=age[i];
            }
        }
        System.out.println("Max Age is "+maxAge);
        for(int i=0;i<=n-1;i++){
            if (age[i]<minAge) {
                minAge=age[i];
            }
        }
        System.out.println("minimum age is "+minAge);
    }
}
