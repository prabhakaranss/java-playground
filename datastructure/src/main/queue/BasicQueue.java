package queue;

public class BasicQueue<T> {

    private int size = 100;
    private T[] data;
    private int queuePointer = -1;

    public BasicQueue() {
        data = (T[]) new Object[size];
    }

    public void enQueue(T item) {
        this.data[++queuePointer] = item;
    }

    public T deQueue() {
        if (queuePointer == -1) {
            throw new IllegalStateException("Queue is enpty");
        }
        T[] tempData = (T[]) new Object[size];
        for (int i = 0; i < queuePointer; i++) {
            tempData[i] = data[i+1];
        }

        T deQueuedItem = data[0];
        this.queuePointer--;
        this.data = tempData;

        return deQueuedItem;

    }

    public int size() {
        return this.queuePointer+1;
    }

    public boolean contains(T item) {
        for (int i =0; i <= queuePointer; i++ ) {
            if (this.data[i].equals(item)) {
                return true;
            }
        }

        return false;
    }

    public T search(T item) throws Exception {
        for (int i =0; i <= queuePointer; i++ ) {
            if (this.data[i].equals(item)) {
                return this.data[i];
            }
        }

        throw new IllegalAccessException("search item not exist");
    }
}
