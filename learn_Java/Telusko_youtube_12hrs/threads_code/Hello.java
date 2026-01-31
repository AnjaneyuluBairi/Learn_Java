import java.util.*;
class SharedResource {
    synchronized void waitMethod() {
        System.out.println(Thread.currentThread().getName() + " is waiting...");
        try {
            wait(); // Thread goes into waiting state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " resumed!");
    }

    synchronized void notifyMethod() {
        System.out.println("Notifying a thread...");
        notify(); // Wakes up one waiting thread
    }
}

public class Hello {
    public static void main(String[] args) {
        SetExample.example();
        SharedResource obj = new SharedResource();

        Thread t1 = new Thread(() -> obj.waitMethod(), "Thread-1");
        Thread t2 = new Thread(() -> obj.notifyMethod(), "Thread-2");

        t1.start();
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        t2.start();
    }
}



 class SetExample {
    public static void example() {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(10);
        hashSet.add(5);

        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);

        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator<Integer> iterator1 = treeSet.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("HashSet: " + hashSet); // Output: Unordered [1, 2, 3] (or any order)
        System.out.println("TreeSet: " + treeSet); // Output: [1, 2, 3] (Sorted)
    }
}

