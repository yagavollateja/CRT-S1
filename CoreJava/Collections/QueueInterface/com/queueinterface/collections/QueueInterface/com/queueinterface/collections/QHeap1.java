package QueueInterface.com.queueinterface.collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class QHeap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Queries to perfom:");
        int n = sc.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        HashMap<Integer,Integer> deleted = new HashMap<>();
        System.out.println("1.Insert into heap\n2.Delete from the Heap\n3.Print minimum\n");
        while (n-->0) {
            System.out.println("Enter Your Choice:");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.print("Enter a Number for insert :");
                int x =sc.nextInt();    
                minHeap.add(x);
            }else if(choice == 2){
                System.out.println("Enter Delete Element:");
                int x = sc.nextInt();
                deleted.put(x, deleted.getOrDefault(x, 0)+1);
            }else if(choice == 3){
            while(!minHeap.isEmpty() &&  deleted.containsKey(minHeap.peek())){
                int top = minHeap.poll();
                System.out.println("The top Element:"+top);
                deleted.put(top,deleted.get(top)-1);
                System.out.println(deleted);
                System.out.println(minHeap);
                if(deleted.get(top)==0){
                    deleted.remove(top);
                    System.out.println(deleted);
                    System.out.println(minHeap);
                }
            }
            if(!minHeap.isEmpty()){
                System.out.println(minHeap.peek());
                System.out.println(deleted);
                System.out.println(minHeap);
            }
        }
        }
        // System.out.println(deleted);
        // System.out.println(minHeap);
    }
}
