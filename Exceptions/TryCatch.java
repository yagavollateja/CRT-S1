import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value:");
        int a=sc.nextInt();
        System.out.print("Enter b value:");
        int b=sc.nextInt();
        try{
            double c=a/(double)b;
            System.out.println("Division of a and b:"+c);
        }
        catch (ArithmeticException e){
            System.out.println("Exception occurs:"+e);
        }
    }
}
