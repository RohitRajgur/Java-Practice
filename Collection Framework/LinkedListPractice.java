import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10); // add()
        System.out.println(list);

        list.addFirst(5); // addFirst()
        System.out.println(list);

        list.addLast(20); // addLast()
        System.out.println(list);

        list.getFirst(); // getFirst()
        System.out.println(list.getFirst());

        list.getLast(); // getLast()
        System.out.println(list.getLast());

        list.removeFirst(); // removeFirst()
        System.out.println(list);

        list.removeLast(); // removeLast()
        System.out.println(list);

        list.clear(); // clear()
        System.out.println(list);
    }
}
