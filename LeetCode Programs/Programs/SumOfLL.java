package Programs;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    ListNode head=null;
    public  ListNode insertelement(Scanner sc){
        char choice;
        do{
            System.out.print("Enter a value for element:");
            int val = sc.nextInt();
            ListNode node = new ListNode(val,null);
            ListNode last ;
            if(head == null){
                head =last = node;
            }else{
                last.next = node;
                last =node;
            }
            System.out.print("Do you want More Nodes:(Y/N):");
        }while(choice == 'Y' || choice =='y');
        return l;
   }
  }
public class SumOfLL {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // insertelement(l1, sc);
    }
    
}