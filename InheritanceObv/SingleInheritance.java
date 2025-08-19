package InheritanceObv;

import java.util.Scanner;

public class SingleInheritance {
    public static void main(String[] args) {
        Car car=new Car(4,"Black","Suziki",60);
        car.display();
        System.out.println("The milege of the car is:"+car.milege);
    }
}
