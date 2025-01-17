import java.util.ArrayList;

public class Counter<T> {
    ArrayList<T> elements;

    public Counter() {
        this.elements = new ArrayList<T>();
    }

    public int getCount() {
        return elements.size();
    }

    void add(T element) {
        elements.add(element);
    }
}
