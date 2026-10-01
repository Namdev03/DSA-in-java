import java.util.*;

public class initial {
    public static void main(String[] arg){
    HashMap<String, Integer> map = new HashMap<>();
    //insertionn Operation
    map.put("India",12);
    map.put("Use",30);
    map.put("china",20);
    map.put("china", 180);
    System.out.println(map);
    if (map.containsKey("china")) {
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
    //gettinng the value of particuler key
    String s = "china";
    System.out.println(map.get(s)  + "is particuler value of "+s);
    // for(int val:map)
    }
}

