package ListInterface.Collections;
import java.util.Vector;

public class VPractice {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        //Add method in Vectors
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(50);
        System.out.println(v1);
        //Retrieve 
        for (Integer integer : v1) {
            System.out.print(integer+" ");
        }
        Vector<Integer> v2 = new Vector<>();
        v2.add(1);
        v2.add(2);
        v2.add(3);
        v2.add(4);
        v2.add(5);
        System.out.println(v2);
        v1.addAll(0,v2);
        System.out.println(v1);
        v1.remove(1);
        System.out.println(v1);
        v1.remove(2);
        System.out.println(v1);
        //Vercation vector
        System.out.println(v1.contains(5));
        System.out.println(v1.containsAll(v2));
        //Update in vector
        v1.set(0, 0);
        v1.set(v1.size()-1, 60);
        System.out.println(v1);
    }
}