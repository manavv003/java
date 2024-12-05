import java.util.Scanner;

class StackException extends Exception {
    public StackException(String message) {
        super(message);
    }
}

class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1; 
    }
    public void push(int value) throws StackException {
        if (top == capacity - 1) {
            throw new StackException("Stack Overflow: Cannot push " + value + " onto the stack.");
        }
        stack[++top] = value;
    }
    public int pop() throws StackException {
        if (top == -1) {
            throw new StackException("Stack Underflow: Cannot pop from an empty stack.");
        }
        return stack[top--];
    }
    public int peek() throws StackException {
        if (top == -1) {
            throw new StackException("Stack is empty: Cannot peek.");
        }
        return stack[top];
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }
}

public class stackwithexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        Stack stack = new Stack(size);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display Stack");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1: 
                        System.out.print("Enter a value to push: ");
                        int value = scanner.nextInt();
                        stack.push(value);
                        System.out.println(value + " pushed onto the stack.");
                        break;
                    case 2: 
                        int poppedValue = stack.pop();
                        System.out.println("Popped value: " + poppedValue);
                        break;
                  
                    case 3: 
                        stack.display();
                        break;
                    case 4: 
                        System.out.println("Exiting program...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (StackException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
