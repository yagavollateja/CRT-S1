import java.util.* ;
public class mulPolynamial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        readArray r = new readArray();
        //degree of the polynomial expression
        System.out.print("Enter Number of Test Cases:");
        int t =sc.nextInt();
       while (t>0) {
            System.out.print("Enter Degree of the polynomial Equation:");
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            System.out.println("\nRead the values of array 1");
            r.readArr(sc, n,a);
            r.display(a);
            System.out.println("\nRead the values of array2");
            r.readArr(sc, n, b);
            r.display(b);
            int res[] =Solution.multiply(a, b, n);
            System.out.println("Resultant Array\n");
            r.display(res);
            t--;
       }
    }
}