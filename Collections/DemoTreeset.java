package Collections;
import java.util.*;
public class DemoTreeset {
	public static void main(String[] args) {
		// TreeSet:
		// - Follows natural sorting order (hence it is good for fast accessing of data).
		// - Does not allow duplicate values.
		SortedSet<String> ss = new TreeSet<>(); // Using SortedSet interface, more general.

		ss.add("harsha");
		ss.add("Deepthi");
		ss.add("Kiran");
		ss.add("Monoj");
		ss.add("Kiran"); // Duplicate, will not be added.

		for (String s : ss) {
			System.out.println("The data: " + s); // The output will be in natural sorted order (alphabetical here).
		}
	}
}

