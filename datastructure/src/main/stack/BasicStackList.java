package stack;

import java.util.ArrayList;
import java.util.List;

public class BasicStackList<T> {

    private List<T> list;

    public BasicStackList() {
        this.list = new ArrayList<>();
    }

    public void push(T newItem) {
        this.list.add(newItem);
    }

    public T pop() {
        if (this.list.size() == 0) {
            throw new IllegalStateException("No items left in stack");
        }
        return list.remove(list.size()-1);
    }

    public boolean contains(T item) {

        return this.list.contains(item);
    }

    public int size() {
        return this.list.size();
    }
}
