public class Stack {

    private static final int DEFAULT_SIZE = 10;
    private int size;
    private int top;
    private int[] values;
    
    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {

        this.size = size;
        values = new int[size];
        top = -1;
    }

    public boolean isFull() {

        if (top < size -1)
            return false;
        else    
            return true;
    }

    public void push(int x) {

        if (!isFull()) {
            top++;
            values[top] = x;
        }
    }

    public boolean isEmpty() {

            if (top == -1)
                return true;
            else  
                return false;
    }

    public int pop() {

        int retVal = 0;
        if (!isEmpty()) {
            retVal = values[top];
            top--;
        }
        return retVal;
    }
}

