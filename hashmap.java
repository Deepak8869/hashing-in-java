import java.util.HashMap;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        //country(key) , population(value)
        HashMap<String , Integer> map = new HashMap();
        // Insertion
        map.put("india" , 120);
        map.put("US", 30);
        map.put("china", 150);

        System.out.println(map);    

        //serach or lookup
        if(map.containsKey("indonesia")){
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }

    }
}
