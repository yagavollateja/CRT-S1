import java.util.*;

public class ArrayRotate
{
    public static int[][] Transpose(int a[][],int n){
        for(int i=0; i<n; i++){
            for(int j=i;j<n;j++){
                int temp=a[j][i];
                a[j][i]=a[i][j];
                a[i][j]=temp;
            }
        }
        return a;
    }
    public int[][] reverse(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0,k=a.length-1;j<k;j++,k--){
                int temp=a[i][j];
                a[i][j]=a[i][k];
                a[i][k]=temp;
            }
        }
        return a;
    } 
    public void display(int[][] a){
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.printf("Enter array element[%d][%d]:",i,j);
                a[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The array before Transpose");
        ArrayRotate ar=new ArrayRotate();
        ar.display(a);
        int b[][]=Transpose(a,n);
        System.out.println("The array  After Transpose");
        ar.display(b);
        int c[][]=ar.reverse(b);
        System.out.println("After rotating matrix");
        ar.display(c);
	}
}

