import ArrarList.Array;

public class For {
    public static  void main(String[] arg){
        int[] arr =  {10,20,30,40,50,60};
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println(sum);

    }
}
