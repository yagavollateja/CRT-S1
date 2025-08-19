package InterFaces;
import java.util.*;
// Inter Created by using interface keyword
public interface Shapes {
    double rectarea(double dim1,double dim2);
    double triangle(double dim1,double dim2);
}
//Interface Shapes implements in SampleShapes class
class SampleShapes implements Shapes{
    public double rectarea(double dim1,double dim2){
        return dim1*dim2;
    }
    public double triangle(double dim1,double dim2){
        return 0.5*dim1*dim2;
    }
}
class InterfaceDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter dim1 and dim2 values:");
        double dim1=sc.nextDouble();
        double dim2=sc.nextDouble();
        SampleShapes s=new SampleShapes();
        System.out.println("Area of the rectanle:"+s.rectarea(dim1,dim2));
        System.out.println("Area of the triangle:"+s.triangle(dim1,dim2));
    }
}