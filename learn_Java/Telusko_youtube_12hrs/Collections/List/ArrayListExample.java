import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial list: " + list);

        // Get an element from the ArrayList
        String fruit = list.get(1);
        System.out.println("Element at index 1: " + fruit);

        // Set an element in the ArrayList
        list.set(1, "Blueberry");
        System.out.println("List after setting element at index 1: " + list);

        // Remove an element from the ArrayList
        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);

        // Check if the ArrayList contains an element
        boolean containsApple = list.contains("Apple");
        System.out.println("List contains 'Apple': " + containsApple);

        // Get the size of the ArrayList
        int size = list.size();
        System.out.println("Size of the list: " + size);

        // Iterate over the elements in the ArrayList
        System.out.println("Iterating over the list:");
        for (String item : list) {
            System.out.println(item);
        }

        // Clear the ArrayList
        list.clear();
        System.out.println("List after clearing: " + list);

        // Check if the ArrayList is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("List is empty: " + isEmpty);

        // Add elements again to demonstrate more methods
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Sort the ArrayList
        Collections.sort(list);
        System.out.println("List after sorting: " + list);

        // Get the index of an element
        int index = list.indexOf("Cherry");
        System.out.println("Index of 'Cherry': " + index);

        // Add an element at a specific index
        list.add(2, "Fig");
        System.out.println("List after adding 'Fig' at index 2: " + list);

        // Remove an element by value
        list.remove("Banana");
        System.out.println("List after removing 'Banana': " + list);

        // Convert the ArrayList to an array
        String[] array = list.toArray(String[]::new);
        System.out.println("Array from ArrayList:");
        for (String item : array) {
            System.out.println(item);
        }
        
        System.out.println(list.getFirst());
        list.add("val1");
        list.add("val2");
        // Create a sublist
        System.out.println(list);

        List<String> sublist =list.subList(1, 3);

        System.out.println("Sublist from index 1 to 3: " + sublist);
    }
}