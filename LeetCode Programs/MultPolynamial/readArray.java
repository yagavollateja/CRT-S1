import java.util.Scanner;

public class readArray {
    public int[] readArr(Scanner sc,int n,int[] arr){
        for(int i = 0;i < n;i++){
            System.out.printf("Enter arr[%d]:",i);
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public void display(int []arr){
        for(int i=0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
