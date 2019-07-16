package stack;

public class BasicStack<T> {

    private T[] data;
    private int indexPointer;

    public BasicStack() {
        data = (T[]) new Object[1000];
        indexPointer = 0;
    }

    public void push(T newItem) {
        data[indexPointer++] = newItem;
    }

    public T pop() {
        if (indexPointer == 0) {
            throw new IllegalStateException("No items left in stack");
        }
        return data[--indexPointer];
    }

    public boolean contains(T item) {

        for (int i = 0; i < indexPointer; i++) {
            if (data[i].equals(item)) {
                return  true;
            }
        }

        return false;
    }

    public int size() {
        return indexPointer;
    }
}
