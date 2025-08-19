import java.util.Scanner;
public class Throw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value:");
        int a=sc.nextInt();
        System.out.print("Enter b value:");
        int b=sc.nextInt();
        try{
			if(b!=0){
				double c=a/b;
				System.out.println("Division of a and b:"+c);
			}
			else{
				throw new ArithmeticException();
			}
        }
        catch (ArithmeticException e){
            //System.out.println("Exception occurs:"+e);
			e.printStackTrace();
        }
    }
}
