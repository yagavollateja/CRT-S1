import java.util.*;
public class ArraySortAllDia{
    public void readArray(int[][] a){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.printf("Enter emelemt[%d][%d]:",i,j);
                a[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }
    public void display(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void arrayDiaSort(int[][] a){
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int g=0;g<a.length;g++){
            for(int i=0, j=g;i<a.length;i++,j++){
                al.add(a[i][j]);
            }
        }
        //Collections.sort(al);
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[0].length;j++){
        //         if(i==j){
        //             int rem=al.remove(0);
        //             a[i][j]=rem;
        //         }
        //     }
        // }
        System.out.println(al);
        al.clear();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArraySortAllDia as=new ArraySortAllDia();
        System.out.print("Enter row size:");
        int r=sc.nextInt();
        System.out.print("Enter column size:");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        as.readArray(a);
        System.out.println("Before array diagonal elements sort");
        as.display(a);
        as.arrayDiaSort(a);
        System.out.println("After array diagonal elements sort");
        as.display(a);
        sc.close();
    }
}
