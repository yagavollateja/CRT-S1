package InheritanceObv;

public class Child extends Parent{
    @Override
    public void display() {
        super.display();
        System.out.println("This is child class method");
    }
}
