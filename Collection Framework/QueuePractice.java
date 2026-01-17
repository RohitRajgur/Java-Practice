import java.util.PriorityQueue;

public class QueuePractice {
    public static void main(String[] args) {

        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(30); // add()
        q.add(10);
        q.add(20);
        System.out.println(q);

        q.peek(); // peek()
        System.out.println(q.peek());

        q.poll(); // poll()
        System.out.println(q);

        q.remove(); // remove()
        System.out.println(q);

        q.clear(); // clear()
        System.out.println(q);
    }
}
