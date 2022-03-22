public class StackExample {

    public static void main(String args[]) {

        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        for (int i = 0; i<3; i++)
            System.out.println(myStack.pop());
    }
}
