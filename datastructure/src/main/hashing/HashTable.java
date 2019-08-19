package hashing;

import java.util.Optional;

public class HashTable<K, T> {
    private static final int INITIAL_TABLE_CAPACITY = 10;
    private Integer tableSize = 0;
    private Node<T>[] tableItems = new Node[INITIAL_TABLE_CAPACITY];

    public Integer size() {
        return tableSize;
    }

    public void put(K key, T value) {
        Integer tableIndex = this.determineTableIndex(key);
        Node<T> node = new Node<>(value);
        this.tableItems[tableIndex] = node;
        this.tableSize++;
    }

    public Optional<T> get(K key) {
        Integer tableIndex = this.determineTableIndex(key);
        return Optional.ofNullable(this.tableItems[tableIndex]).map(matchedNode -> matchedNode.value);
    }

    private Integer determineTableIndex(K key) {
        return Math.abs(key.hashCode()% INITIAL_TABLE_CAPACITY);
    }


    private final class Node<NT> {
        NT value;

        public Node(NT value) {
            this.value = value;
        }

        public NT getValue() {
            return value;
        }
    }
}
