
import java.util.*;

public class PriorityQueueDemo {

      // Main Method
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(2);
        pq.add(4);
        pq.add(7);

        Iterator<Integer> iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("");
    }
}
