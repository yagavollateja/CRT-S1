import java.util.*;
class Throws{
	double div(int a,int b) throws ArithmeticException{
		double c=a/b;
		return c;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a and b values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Throws obj=new Throws();
		try{
			double div=obj.div(a,b);
			System.out.println("The result is:"+div);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}