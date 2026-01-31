import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        
        // Create a Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert elements
        minHeap.add(10);
        minHeap.add(40);
        minHeap.add(30);
        minHeap.add(50);
        minHeap.add(20);

        // Print the min heap (removing elements in ascending order)
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " "); // Output: 10 20 30 40 50
        }
    }
}
