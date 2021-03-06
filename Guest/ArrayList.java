
import java.util.Arrays;

public class ArrayList {
    private Object[] elems;
    private int next;

    public ArrayList(int capacity){
        elems = new Object[capacity];
    }

    public ArrayList(){
        this(16);
    }

    public void add(Object k){
        if(next == elems.length)
            elems = Arrays.copyOf(elems, elems.length*2);
        
        elems[next++] = k;
    }

    public Object get(int index){
        return elems[index];
    }

    public int size(){
        return next;
    }
}