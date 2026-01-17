import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "One"); // put()
        System.out.println(map);

        map.put(2, "Two");
        System.out.println(map);

        map.get(1); // get()
        System.out.println(map.get(1));

        map.containsKey(2); // containsKey()
        System.out.println(map.containsKey(2));

        map.remove(1); // remove()
        System.out.println(map);

        map.clear(); // clear()
        System.out.println(map);
    }
}
