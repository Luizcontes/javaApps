import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        for(int i =0; i < list.size(); i++) {
            int temp = list.get(i);
            System.out.println(temp);
        }
        for(int i=list.size()-1; i>=0; i--) {
            int temp = list.get(i);
            System.out.println(temp);
        }
    }
}