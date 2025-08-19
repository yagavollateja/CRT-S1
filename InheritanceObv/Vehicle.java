package InheritanceObv;

public class Vehicle {
    int wheels;
    String color;
    String vehicleName;

    public Vehicle(int wheels, String color, String vehicleName) {
        this.wheels = wheels;
        this.color = color;
        this.vehicleName = vehicleName;
    }

    public void display(){
        System.out.println("Vehicle Name:"+vehicleName);
        System.out.println("color:"+color);
        System.out.println("Number of wheels:"+wheels);
    }

}
