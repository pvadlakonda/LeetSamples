package com.custom;

import java.util.ArrayList;
import java.util.List;

/**
 * Custom HashMap implementation using separate chaining for collision resolution.
 * Implements core HashMap functionality without using Java's built-in HashMap.
 *
 * @param <K> Key type
 * @param <V> Value type
 */
public class CustomHashMap<K, V> {

    /**
     * Entry class to store key-value pairs
     */
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Entry<K, V>[] buckets;
    private int capacity;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    /**
     * Constructor with default capacity
     */
    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        this.capacity = DEFAULT_CAPACITY;
        this.buckets = new Entry[capacity];
        this.size = 0;
    }

    /**
     * Constructor with custom initial capacity
     */
    @SuppressWarnings("unchecked")
    public CustomHashMap(int initialCapacity) {
        this.capacity = initialCapacity;
        this.buckets = new Entry[capacity];
        this.size = 0;
    }

    /**
     * Hash function to compute bucket index
     */
    private int getBucketIndex(K key) {
        if (key == null) {
            return 0;
        }
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % capacity;
    }

    /**
     * Put a key-value pair into the map
     * @return previous value associated with key, or null if there was no mapping
     */
    public V put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> head = buckets[bucketIndex];

        // Check if key already exists, update value if so
        Entry<K, V> current = head;
        while (current != null) {
            if ((current.key == null && key == null) ||
                    (current.key != null && current.key.equals(key))) {
                V oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            current = current.next;
        }

        // Key doesn't exist, add new entry at the beginning of the chain
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = head;
        buckets[bucketIndex] = newEntry;
        size++;

        // Check if we need to resize
        if ((double) size / capacity >= LOAD_FACTOR) {
            resize();
        }

        return null;
    }

    /**
     * Get value associated with a key
     * @return value associated with key, or null if key doesn't exist
     */
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> current = buckets[bucketIndex];

        while (current != null) {
            if ((current.key == null && key == null) ||
                    (current.key != null && current.key.equals(key))) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    /**
     * Remove a key-value pair from the map
     * @return value associated with the removed key, or null if key doesn't exist
     */
    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> current = buckets[bucketIndex];
        Entry<K, V> previous = null;

        while (current != null) {
            if ((current.key == null && key == null) ||
                    (current.key != null && current.key.equals(key))) {

                // Remove the entry
                if (previous == null) {
                    // Removing the head of the chain
                    buckets[bucketIndex] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return current.value;
            }
            previous = current;
            current = current.next;
        }

        return null;
    }

    /**
     * Check if map contains a key
     */
    public boolean containsKey(K key) {
        return get(key) != null || (get(key) == null && keyExistsWithNullValue(key));
    }

    /**
     * Helper method to check if a key exists with null value
     */
    private boolean keyExistsWithNullValue(K key) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> current = buckets[bucketIndex];

        while (current != null) {
            if ((current.key == null && key == null) ||
                    (current.key != null && current.key.equals(key))) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Get the number of key-value pairs in the map
     */
    public int size() {
        return size;
    }

    /**
     * Check if map is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Clear all entries from the map
     */
    @SuppressWarnings("unchecked")
    public void clear() {
        buckets = new Entry[capacity];
        size = 0;
    }

    /**
     * Resize the bucket array when load factor is exceeded
     */
    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = capacity * 2;
        Entry<K, V>[] oldBuckets = buckets;
        buckets = new Entry[newCapacity];
        capacity = newCapacity;
        size = 0;

        // Rehash all entries
        for (Entry<K, V> head : oldBuckets) {
            Entry<K, V> current = head;
            while (current != null) {
                put(current.key, current.value);
                current = current.next;
            }
        }
    }

    /**
     * Get all keys in the map
     */
    public List<K> keySet() {
        List<K> keys = new ArrayList<>();
        for (Entry<K, V> head : buckets) {
            Entry<K, V> current = head;
            while (current != null) {
                keys.add(current.key);
                current = current.next;
            }
        }
        return keys;
    }

    /**
     * Get all values in the map
     */
    public List<V> values() {
        List<V> vals = new ArrayList<>();
        for (Entry<K, V> head : buckets) {
            Entry<K, V> current = head;
            while (current != null) {
                vals.add(current.value);
                current = current.next;
            }
        }
        return vals;
    }

    /**
     * Display the map structure (for debugging)
     */
    public void display() {
        System.out.println("HashMap [size=" + size + ", capacity=" + capacity + "]");
        for (int i = 0; i < capacity; i++) {
            if (buckets[i] != null) {
                System.out.print("Bucket " + i + ": ");
                Entry<K, V> current = buckets[i];
                while (current != null) {
                    System.out.print("[" + current.key + "=" + current.value + "] -> ");
                    current = current.next;
                }
                System.out.println("null");
            }
        }
    }

    /**
     * Main method with test cases
     */
    public static void main(String[] args) {
        System.out.println("=== CustomHashMap Test Cases ===\n");

        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        // Test 1: Basic put and get
        System.out.println("Test 1: Basic put and get");
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("get('one'): " + map.get("one"));
        System.out.println("get('two'): " + map.get("two"));
        System.out.println("get('three'): " + map.get("three"));
        System.out.println("Size: " + map.size());
        System.out.println();

        // Test 2: Update existing key
        System.out.println("Test 2: Update existing key");
        Integer oldValue = map.put("two", 22);
        System.out.println("Old value for 'two': " + oldValue);
        System.out.println("New value for 'two': " + map.get("two"));
        System.out.println("Size: " + map.size());
        System.out.println();

        // Test 3: Remove
        System.out.println("Test 3: Remove");
        Integer removed = map.remove("one");
        System.out.println("Removed value: " + removed);
        System.out.println("get('one') after removal: " + map.get("one"));
        System.out.println("Size: " + map.size());
        System.out.println();

        // Test 4: ContainsKey
        System.out.println("Test 4: ContainsKey");
        System.out.println("containsKey('two'): " + map.containsKey("two"));
        System.out.println("containsKey('one'): " + map.containsKey("one"));
        System.out.println();

        // Test 5: Null key handling
        System.out.println("Test 5: Null key handling");
        map.put(null, 999);
        System.out.println("get(null): " + map.get(null));
        System.out.println();

        // Test 6: Collision handling (force collisions with custom objects)
        System.out.println("Test 6: Testing with more entries");
        for (int i = 0; i < 20; i++) {
            map.put("key" + i, i * 10);
        }
        System.out.println("Size after adding 20 entries: " + map.size());
        System.out.println("get('key5'): " + map.get("key5"));
        System.out.println("get('key15'): " + map.get("key15"));
        System.out.println();

        // Test 7: KeySet and Values
        System.out.println("Test 7: KeySet and Values");
        CustomHashMap<String, String> smallMap = new CustomHashMap<>();
        smallMap.put("A", "Apple");
        smallMap.put("B", "Banana");
        smallMap.put("C", "Cherry");
        System.out.println("Keys: " + smallMap.keySet());
        System.out.println("Values: " + smallMap.values());
        System.out.println();

        // Test 8: Display structure
        System.out.println("Test 8: Display internal structure");
        CustomHashMap<Integer, String> displayMap = new CustomHashMap<>(4);
        displayMap.put(1, "One");
        displayMap.put(5, "Five");  // Will likely collide with 1 in a bucket of size 4
        displayMap.put(9, "Nine");  // Will likely collide with 1 and 5
        displayMap.put(2, "Two");
        displayMap.display();
        System.out.println();

        // Test 9: Clear
        System.out.println("Test 9: Clear");
        smallMap.clear();
        System.out.println("Size after clear: " + smallMap.size());
        System.out.println("isEmpty: " + smallMap.isEmpty());

        System.out.println("\n=== All tests completed ===");
    }
}