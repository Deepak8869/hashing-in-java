import java.util.HashSet;
import java.util.Iterator;
public class hashset {
     public static void main(String[] args) {
        //creating of hashset
        HashSet<Integer> set = new HashSet<>();
        
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Search
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Does not contain");
        }


        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Does not contain 1");
        }
         //size
        System.out.println("Size of set is " + set.size());

        //print all element in set
        System.out.println(set);


        //iterator
        Iterator it = set.iterator();
     //hashnext
     //next
     while(it.hasNext()){
        System.out.print(it.next()+ " ");
     }
     }
     
}
