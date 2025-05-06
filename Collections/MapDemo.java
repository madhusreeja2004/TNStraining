package Collections;
import java.util.*;

// Demo for Map in Java
public class MapDemo {
    public static void main(String[] args) {
        // Map follows a key-value structure (key, value)
        // HashMap provides data in arbitrary order
        Map<String, Integer> mp = new HashMap<>();

        // Adding key-value pairs to the HashMap
        mp.put("Bobby", 78);
        mp.put("Joel", 98);
        mp.put("harsha", 67);
        mp.put("harsha", 67); // Duplicate key, value gets overwritten
        // mp.put(null, null); // Null keys and values are allowed in HashMap, but can lead to NullPointerException if not handled carefully.

        // Iterating through the HashMap using entrySet()
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            String key = entry.getKey();   // Get the key from the entry
            int value = entry.getValue(); // Get the value from the entry
            System.out.println(key + ":" + value); // Print the key-value pair
        }

        System.out.println("The LinkedHashMap data:");

        // LinkedHashMap:  Maintains insertion order.
        Map<String, Integer> m = new LinkedHashMap<>();

        m.put("Bobby", 78);
        m.put("Joel", 98);
        m.put("harsha", 67);
        m.put("harsha", 67); // Duplicate key, value gets overwritten
        // m.put(null, null);  //  Null keys and values are allowed, same caution as HashMap.

        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ":" + value);
        }

        System.out.println("The TreeMap data:");

        // TreeMap:  Stores keys in natural sorted order.
        Map<String, Integer> tm = new TreeMap<>();

        tm.put("Bobby", 78);
        tm.put("Joel", 98);
        tm.put("harsha", 67);
        tm.put("harsha", 67);  // Duplicate key, value gets overwritten
        // tm.put(null,null); // Null keys are not allowed in TreeMap,  NullPointerException.
        for (Map.Entry<String, Integer> entry : tm.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}

