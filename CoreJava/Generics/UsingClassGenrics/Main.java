package UsingClassGenrics;
public class Main {
    public static void main(String[] args) {
        Generic<almond> aldBox = new Generic<>(5);
        aldBox.add(new almond("Apple"));
        aldBox.add(new almond("Banana"));
        aldBox.add(new almond("Cherry"));
        aldBox.add(new almond("Guva"));
        System.out.println(aldBox.get(3).name);
        System.out.println(aldBox.get(2).name);
        Generic<cashew> cashBox = new Generic<>(3);
        cashBox.add(new cashew("Gidipapu"));
        cashBox.add(new cashew("Badham"));
        System.out.println(cashBox.get(1).name);
        System.out.println(cashBox.get(0).name);
    }
}
