public class queueArrayDemo {

    public static void main (String[] args) {
        Queue queue = new Queue(8);
        for (int i=1; i<4; i++) {
            queue.enqueue(i*10);
        }

        for (int i=0; i<3; i++) {
            System.out.println(queue.dequeue());
        }
    }
    
}
