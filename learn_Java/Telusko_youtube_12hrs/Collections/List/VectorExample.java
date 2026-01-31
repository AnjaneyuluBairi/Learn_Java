import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        System.out.println("Capacity of the vector: " + vector.capacity());

        // Add elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Banana");
        vector.add("Cherry");
        System.out.println("Initial vector: " + vector);

        List<String> subList = vector.subList(1,4 ); 
        System.out.println("Sublist from index 2 to 5: " + subList);

        // Add elements at a specific index
        vector.add(1, "Blueberry");
        System.out.println("Vector after adding 'Blueberry' at index 1: " + vector);

        // Get an element from the Vector
        String fruit = vector.get(2);
        System.out.println("Element at index 2: " + fruit);

        // Set an element in the Vector
        vector.set(2, "Date");
        System.out.println("Vector after setting element at index 2: " + vector);

        // Remove an element from the Vector by index
        vector.remove(3);
        System.out.println("Vector after removing element at index 3: " + vector);

        // Remove an element from the Vector by value
        vector.remove("Apple");
        System.out.println("Vector after removing 'Apple': " + vector);

        // Check if the Vector contains an element
        boolean containsBanana = vector.contains("Banana");
        System.out.println("Vector contains 'Banana': " + containsBanana);

        // Get the size of the Vector
        int size = vector.size();
        System.out.println("Size of the vector: " + size);

        // Iterate over the elements in the Vector
        System.out.println("Iterating over the vector:");
        for (String item : vector) {
            System.out.println(item);
        }

        // Clear the Vector
        vector.clear();
        System.out.println("Vector after clearing: " + vector);

        
        // Check if the Vector is empty
        boolean isEmpty = vector.isEmpty();
        System.out.println("Vector is empty: " + isEmpty);

        // Add elements again to demonstrate more methods
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");
        vector.add("Elderberry");

        // Get the first element
        String firstElement = vector.firstElement();
        System.out.println("First element: " + firstElement);

        // Get the last element
        String lastElement = vector.lastElement();
        System.out.println("Last element: " + lastElement);

        // Get the index of an element
        int index = vector.indexOf("Cherry");
        System.out.println("Index of 'Cherry': " + index);

        // Convert the Vector to an array
        String[] array = vector.toArray(new String[0]);
        System.out.println("Array from Vector:");
        for (String item : array) {
            System.out.println(item);
        }

        // Create a sublist
        Vector<String> sublist = new Vector<>(vector.subList(1, 3));
        System.out.println("Sublist from index 1 to 3: " + sublist);

        // Sort the Vector
        Collections.sort(vector);
        System.out.println("Vector after sorting: " + vector);

        // Use Enumeration to iterate over elements
        Enumeration<String> enumeration = vector.elements();
        System.out.println("Iterating over the vector using Enumeration:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        Iterator<String> iterator = vector.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Check the capacity of the Vector
        int capacity = vector.capacity();
        System.out.println("Capacity of the vector: " + capacity);

        // Trim the capacity of the Vector to the current size
        vector.trimToSize();
        System.out.println("Capacity of the vector after trimToSize: " + vector.capacity());

        // Ensure the capacity of the Vector
        vector.ensureCapacity(10);
        System.out.println("Capacity of the vector after ensureCapacity(10): " + vector.capacity());
    }
}