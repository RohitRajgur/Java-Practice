import java.util.ArrayList;

public class ArrayListpractice {
    public static void main(String[] args) {

        ArrayList<Integer> StudentName = new ArrayList<>();

        StudentName.add(1); // add()
        System.out.println(StudentName);

        StudentName.add(2); // add()
        System.out.println(StudentName);

        StudentName.add(0, 10); // add(index, element)
        System.out.println(StudentName);

        StudentName.get(0); // get()
        System.out.println(StudentName.get(0));

        StudentName.set(0, 100); // set()
        System.out.println(StudentName);

        StudentName.remove(0); // remove(index)
        System.out.println(StudentName);

        StudentName.remove(Integer.valueOf(2)); // remove(Object)
        System.out.println(StudentName);

        StudentName.size(); // size()
        System.out.println(StudentName.size());

        StudentName.contains(1); // contains()
        System.out.println(StudentName.contains(1));

        StudentName.isEmpty(); // isEmpty()
        System.out.println(StudentName.isEmpty());

        StudentName.indexOf(1); // indexOf()
        System.out.println(StudentName.indexOf(1));

        StudentName.lastIndexOf(1); // lastIndexOf()
        System.out.println(StudentName.lastIndexOf(1));

        StudentName.toArray(); // toArray()
        System.out.println(StudentName.toArray().length);

        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(50);

        StudentName.addAll(temp); // addAll()
        System.out.println(StudentName);

        StudentName.removeAll(temp); // removeAll()
        System.out.println(StudentName);

        StudentName.retainAll(temp); // retainAll()
        System.out.println(StudentName);

        StudentName.clear(); // clear()
        System.out.println(StudentName);

        StudentName.isEmpty(); // isEmpty()
        System.out.println(StudentName.isEmpty());
    }
}
