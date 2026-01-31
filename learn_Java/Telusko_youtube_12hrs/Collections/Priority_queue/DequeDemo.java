import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        // Create a Deque
        Deque<Integer> deque = new ArrayDeque<>();

        // Add elements to the deque
        deque.add(60); // Adds 10 to the end of the deque
        deque.add(80); // Adds 20 to the end of the deque
        deque.addFirst(10); // Add to the front
        deque.addLast(20);  // Add to the back
        deque.addFirst(5);  // Add to the front again
        deque.offerFirst(1); // Offer to the front
        deque.offerLast(25); // Offer to the back

        // Display the deque
        System.out.println("Deque after additions: " + deque);

        // Peek at the elements
        System.out.println("First element (peekFirst): " + deque.peekFirst());
        System.out.println("Last element (peekLast): " + deque.peekLast());

        // Access elements without removal
        System.out.println("First element (getFirst): " + deque.getFirst());
        System.out.println("Last element (getLast): " + deque.getLast());

        // Remove elements from the deque
        System.out.println("Removed from front (pollFirst): " + deque.pollFirst());
        System.out.println("Removed from back (pollLast): " + deque.pollLast());
        System.out.println("Removed from front (removeFirst): " + deque.removeFirst());
        System.out.println("Removed from back (removeLast): " + deque.removeLast());

        // Display the deque after removals
        System.out.println("Deque after removals: " + deque);

        // Add elements back for further operations
        deque.add(30);
        deque.add(40);
        deque.add(50);

        // Check if deque contains an element
        System.out.println("Does deque contain 40? " + deque.contains(40));

        // Iterate through the deque
        System.out.println("Iterating through deque:");
        for (Integer element : deque) {
            System.out.println(element);
        }

        // Clear the deque
        deque.clear();
        System.out.println("Deque after clearing: " + deque);

        // Check if the deque is empty
        System.out.println("Is the deque empty? " + deque.isEmpty());
    }
}