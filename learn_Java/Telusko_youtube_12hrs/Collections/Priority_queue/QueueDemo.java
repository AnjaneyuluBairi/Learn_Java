import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Create a PriorityQueue
        Queue<Integer> queue = new PriorityQueue<>();

        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(15);

        // Display the queue
        System.out.println("Queue: " + queue);

        // Peek at the head of the queue
        System.out.println("Head of the queue: " + queue.peek());

        // Remove elements from the queue
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}