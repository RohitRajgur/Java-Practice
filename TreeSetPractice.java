import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        set.add("Apple"); // add()
        System.out.println(set);

        set.add("Banana"); // add()
        System.out.println(set);

        set.add("Apple"); // duplicate (ignored)
        System.out.println(set);

        set.contains("Apple"); // contains()
        System.out.println(set.contains("Apple"));

        set.size(); // size()
        System.out.println(set.size());

        set.remove("Banana"); // remove()
        System.out.println(set);

        set.clear(); // clear()
        System.out.println(set);
    }
}