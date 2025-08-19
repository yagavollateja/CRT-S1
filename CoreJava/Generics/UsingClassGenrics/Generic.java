package UsingClassGenrics;

public class Generic<T> {
    public T[] dryfruits;
    int index;
    @SuppressWarnings("unchecked")
    public Generic(int size){
        dryfruits =(T[]) new Object[size];
        index=0;
    }
    public void add(T dryfruit){
        dryfruits[index]=dryfruit;
        index++;
    }
    public T get(int i){
        return dryfruits[i];
    }
}

