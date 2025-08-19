package PersonGeneric;

import java.lang.reflect.Array;

// Generic class that holds an array of objects
public class GenericArray<T> {
    private T[] array;

    // Constructor to create a generic array using reflection
    @SuppressWarnings("unchecked")
    public GenericArray(Class<T> clazz, int size) {
        array = (T[]) Array.newInstance(clazz, size);
    }

    // Method to set an object in the array
    public void set(int index, T value) {
        array[index] = value;
    }

    // Method to get an object from the array
    public T get(int index) {
        return array[index];
    }

    // Method to get the array length
    public int length() {
        return array.length;
    }

    public static void main(String[] args) {
        // Using GenericArray with a custom class (Person)
        GenericArray<Person> peopleArray = new GenericArray<>(Person.class, 3);

        // Adding Person objects to the array
        peopleArray.set(0, new Person("Teja", 20));
        peopleArray.set(1, new Person("Rahul", 22));
        peopleArray.set(2, new Person("Anjali", 21));

        // Retrieving and displaying Person objects
        for (int i = 0; i < peopleArray.length(); i++) {
            System.out.println(peopleArray.get(i));
        }
    }
}

// A sample class to store in the generic array
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

