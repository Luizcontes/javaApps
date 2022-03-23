class Queue {
    
    private static final int DEFAULT_SIZE = 8;
    private int size;
    private int front;
    private int back;
    private int[] values;

    public Queue() {
        this(DEFAULT_SIZE);
    }

    public Queue(int size) {
        this.size = size;
        values = new int[size];
        front = 0;
        back = 0;
    }

    public boolean isFull() {
        if ((back+1) % size == front) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (back == front) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int x) {
        if (!isFull()) {
            back = (back+1) % size;
            values[back] = x;
        }
    }

    public int dequeue() {
        if(!isEmpty()) {
            front = (front+1) % size;
            return values[front];
        }
        return 0;
    }
}