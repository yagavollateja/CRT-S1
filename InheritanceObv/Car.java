package InheritanceObv;

public class Car extends Vehicle{
    int milege;
    public Car(int wheels, String color, String vehicleName,int milege) {
        super(wheels, color, vehicleName);
        this.milege=milege;
    }

    public int getMilege() {
        return milege;
    }
}
