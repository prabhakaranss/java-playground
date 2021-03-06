package hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HashTableTest {

    @Test
    public void shouldCreateHashTable() {
        assertNotNull(new HashTable<String, String>());
    }

    @Test
    public void shouldReturnSizeOfEmptyTable() {
        HashTable<String, String> hashTable = new HashTable<>();
        assertEquals(hashTable.size().intValue(), 0);
    }

    @Test
    public void shouldReturnEmptyOnGet() {
        HashTable<String, String> hashTable = new HashTable<>();
        assertFalse(hashTable.get("name").isPresent());
    }

    @Test
    public void shouldReturnAValueOnGet() {
        HashTable<String, String> hashTable = new HashTable<>();
        hashTable.put("name", "prabhakaran");
        hashTable.put("name", "prabhakaranSS");
        assertEquals(hashTable.get("name").get(), "prabhakaranSS");
    }

    @Test
    public void shouldReturnValidSizeOfTable() {
        HashTable<String, String> hashTable = new HashTable<>();
        hashTable.put("first_name", "prabhakaran");
        hashTable.put("last_name", "SS");
        hashTable.put("age", "30");
        assertEquals(hashTable.size().intValue(), 3);
    }

}
