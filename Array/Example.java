
import java.util.ArrayList;
import java.util.List;
public class Example {

    public static void main(String[] args) {

        // Array
        int[] arr = {10, 20, 30};
        System.out.println(arr.length); // 3
       int[] arr1={100,90,80,70,50};
       System.out.println( "length of array"+ arr1.length);
        // String
        String str = "Namdev";
        System.out.println(str.length()); // 6
        String str1 = "NAMDEVKADMA";
        System.out.println( "length of NAMDEVKADAM" + str1.length());
        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        List<Integer> l = new ArrayList<>();
        l.add(100);
        l.add(200);
        l.add(300);
        l.add(400);
        System.out.println("length of List l "+ l.size());
        System.out.println(list.size()); // 2
    }
}
