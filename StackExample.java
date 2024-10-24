import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //Declare Stack
        Stack<Integer> stack= new Stack<>();
        //Enter 10 elements
        stack.push(10);
        stack.push(19);
        stack.push(25);
        stack.push(01);
        stack.push(12);
        stack.push(35);
        stack.push(22);
        stack.push(54);
        stack.push(43);
        stack.push(66);
        System.out.println("Stack Elements:");
        //Print Elements
        System.out.println(stack);
        //remove 4 items from stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Stack Elements After removal of 4 elements:");
        //Print stack elements after removal of elements
        System.out.println(stack);
    }
}
