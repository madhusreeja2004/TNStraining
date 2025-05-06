package Collections;
import java.util.*;
// Demo for all implementation classes for the Set interface
public class DemoSet {
    public static void main(String[] args) {
        // HashSet:
        // - Does not preserve insertion order.
        // - Does not store duplicate values.
        Set<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(12);
        hs.add(30);
        hs.add(10); // Duplicate, will not be added.
        hs.add(3);

        System.out.println("Data from HashSet:");
        for (int i : hs) {
            System.out.println("The data of hashset: " + i); // Output will not be in the order of insertion.
        }

        System.out.println("\nData from LinkedHashSet:");
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        lh.add(10);
        lh.add(12);
        lh.add(30);
        lh.add(10); // Duplicate, will not be added.
        lh.add(3);
        System.out.println(lh); // Output will be in the order of insertion: [10, 12, 30, 3]
    }
}
