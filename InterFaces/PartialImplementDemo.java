package InterFaces;
interface Study{
    double add(double a,double b);
    double sub(double a,double b);
}

abstract class Room implements Study{

    @Override
    public double add(double a,double b) {
        //System.out.println("Theory Work in Class Room");
        return a+b;
    }
}

class Lab extends Room{

    @Override
    public double sub(double a,double b) {
        //System.out.println("Practical Work in Lab");
        return b-a;
    }
}
class PartialImplementDemo {

    public static void main(String[] a) {

        Lab L = new Lab();
        double d = L.add(10, 20);
        double e = L.sub(10, 20);
        System.out.println("a+b=" + d + "b-a:" + e);
    }
}

