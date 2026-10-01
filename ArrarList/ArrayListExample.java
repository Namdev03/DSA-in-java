package ArrarList;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        //Insert the element in arrayList
        arr.add(10);
        arr.add(20);
        arr.add(30);
        //Prining the element of arraylist
        System.out.println(arr);
        //get the particuler index value or entity 
        int ele = arr.get(0);
         System.out.println(ele + " ilement of index "+ ele);
       //Add the element in between  the different element   
       arr.add(1,40);
        System.out.println(arr);
       // set the elment means update the element
       arr.set(3,50);
        System.out.println(arr);
        //remove the element from particuler index
        arr.remove(1);
        System.out.println(arr);
        //size of collection
        int size = arr.size();
        size +=1;
        System.out.println(size);
    } 
}