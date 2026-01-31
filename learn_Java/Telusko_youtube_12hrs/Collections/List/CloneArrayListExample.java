import java.util.ArrayList;

public class CloneArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> originalList = new ArrayList<>();

        // Add elements to the ArrayList
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        System.out.println("Original list: " + originalList);

        // Clone the ArrayList
        @SuppressWarnings("unchecked")
        ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();
        System.out.println("Cloned list: " + clonedList);

        // Modify the original list
        originalList.add("Date");
        System.out.println("Original list after modification: " + originalList);
        System.out.println("Cloned list after original list modification: " + clonedList);

        // Modify the cloned list
        clonedList.add("Elderberry");
        System.out.println("Original list after cloned list modification: " + originalList);
        System.out.println("Cloned list after modification: " + clonedList);
    }
}