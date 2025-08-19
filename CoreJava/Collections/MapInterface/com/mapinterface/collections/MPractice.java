package MapInterface.com.mapinterface.collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MPractice {
    public static void main(String[] args) {
        Map<Integer,String> m = new Hashtable<>();
        //Addition operation on Map
        m.put(112200, "Hyderabad");
        m.put(112201, "Mumbai");
        m.put(112202, "Delhi");
        //create set and store the key into set
        Set<Integer> keys = m.keySet();
        for (Integer key : keys) {
            System.out.print(key+" ");
        }
        System.out.println("\n  |      |      |");
        //retrieval of values from the map
        Collection<String> values = m.values();
        for (String val : values) {
            System.out.print(val+" ");
        }
        //retrieve the value from the map based on the key
        System.out.println("\n"+m.get(112200));
        //retrieve the all valuews usings keys
        for (Integer key : keys) {
            System.out.println(key+"---->"+m.get(key));
        }
        //delete the element from the map
        System.out.println(m);
        m.remove(112202);
        System.out.println(m);
        //verification of key and values
        System.out.println(m.containsKey(112200));
        System.out.println(m.containsValue("Hyderabad"));
        //updation of element in map
        System.out.println(m);
        m.put(112201, "AndraPradesh");
        System.out.println(m);
        //when keys is not present at the value is inserted other doesnot insert the values
        m.putIfAbsent(112201, "AndraPradesh");
        m.replace(112201, "Mumbai");
        System.out.println(m);
        //find the size of map
        System.out.println(m.size());
        //clear the map
        m.clear();
        System.out.println(m);
    }     
}
