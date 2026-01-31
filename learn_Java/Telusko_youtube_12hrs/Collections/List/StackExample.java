import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack
        Stack<String> stack = new Stack<>();

        // Push elements onto the Stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Initial stack: " + stack);


        int position = stack.search("Cherry");
        System.out.println("Position of 'Cherry' in the stack: " + position);

        // Peek at the top element without removing it
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Pop elements from the Stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping: " + stack);

        // Check if the Stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Stack is empty: " + isEmpty);

        // Search for an element in the Stack
        position = stack.search("Apple");
        System.out.println("Position of 'Apple' in the stack: " + position);

        // Push more elements onto the Stack
        stack.push("Date");
        stack.push("Elderberry");
        System.out.println("Stack after pushing more elements: " + stack);

        // Iterate over the elements in the Stack
        System.out.println("Iterating over the stack:");
        for (String item : stack) {
            System.out.println(item);
        }

        // Clear the Stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);

        // Check if the Stack is empty after clearing
        isEmpty = stack.isEmpty();
        System.out.println("Stack is empty after clearing: " + isEmpty);
    }
}