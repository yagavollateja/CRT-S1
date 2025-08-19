// import java.util.*;

// class Solution {
//     public int romanToInt(String s) {
//         int val=0;
//         Map<Character,Integer> romans=new HashMap<>();
//         romans.put('I',1);
//         romans.put('V',5);
//         romans.put('X',10);
//         romans.put('L',50);
//         romans.put('C',100);
//         romans.put('D',500);
//         romans.put('M',1000);
//         int res=0;
//         for(int i=0;i<s.length()-1;i++){
//             int cur=romans.get(s.charAt(i));
//             int next=romans.get(s.charAt(i+1));
//             if(cur<next){
//                 res-=cur;
//             }
//             else{
//                 res+=cur;
//             }
//         }
//         res+=romans.get(s.charAt(s.length()-1));
//         return res;
//     }
// }
// public class RomansNumber {
//     public static void main(String[] args) {
//         Solution s=new Solution();
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Roman Number:");
//         String s=sc.nextLine();
        
//     }
// }