import java.util.Scanner;

public class ArraySumTarget {
    public int[] sumOfTarget(int[] a,int t,int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]==t-a[i]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element"+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a Target element:");
        int tar=sc.nextInt();
        ArraySumTarget ast=new ArraySumTarget();
        int ar[]=ast.sumOfTarget(arr,tar,n);
        System.out.println("The sum of Target Indexes is");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        sc.close();
    }
}
