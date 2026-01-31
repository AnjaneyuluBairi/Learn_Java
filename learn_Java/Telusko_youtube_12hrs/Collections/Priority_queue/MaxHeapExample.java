import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        
        // Create a Max Heap using a Comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Insert elements
        maxHeap.add(10);
        maxHeap.add(40);
        maxHeap.add(30);
        maxHeap.add(50);
        maxHeap.add(20);

        // Print the max heap (removing elements in descending order)
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " "); // Output: 50 40 30 20 10
        }
    }
}
