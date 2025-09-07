class MyStack {
    private int[] stackArray;
    private int top;
    private int maxSize;

    // Constructor
    public MyStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Empty stack
    }

    // PUSH with Exception Handling
    public void push(int value) throws Exception {
        if (top == maxSize - 1) {
            throw new Exception("Stack Overflow! Cannot push " + value);
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    // POP with Exception Handling
    public int pop() throws Exception {
        if (top == -1) {
            throw new Exception("Stack Underflow! Cannot pop");
        }
        return stackArray[top--];
    }

    // PEEK with Exception Handling
    public int peek() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is empty! Cannot peek");
        }
        return stackArray[top];
    }
}

public class StackExceptionExample {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            // This will cause overflow
            stack.push(40);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Top element: " + stack.peek());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
            // This will cause underflow
            System.out.println("Popped: " + stack.pop());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
10 pushed into stack
20 pushed into stack
30 pushed into stack
Error: Stack Overflow! Cannot push 40
Top element: 30
Popped: 30
Popped: 20
Popped: 10
Error: Stack Underflow! Cannot pop
*/
