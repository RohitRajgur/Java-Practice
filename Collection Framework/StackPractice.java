import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {

        Stack<String> animal = new Stack<>();

        animal.push("Dog"); // push()
        System.out.println(animal);

        animal.push("Cat"); // push()
        System.out.println(animal);

        animal.push("Lion"); // push()
        System.out.println(animal);

        animal.push("Horse"); // push()
        System.out.println(animal);

        animal.peek(); // peek()
        System.out.println("Peek element: " + animal.peek());

        animal.pop(); // pop()
        System.out.println("After pop(): " + animal);

        animal.search("Cat"); // search()
        System.out.println("Position of Cat: " + animal.search("Cat"));

        animal.empty(); // empty()
        System.out.println("Is stack empty? " + animal.empty());

        animal.size(); // size()
        System.out.println("Size of stack: " + animal.size());

        animal.contains("Dog"); // contains()
        System.out.println("Contains Dog? " + animal.contains("Dog"));

        animal.firstElement(); // firstElement()
        System.out.println("First element: " + animal.firstElement());

        animal.lastElement(); // lastElement()
        System.out.println("Last element: " + animal.lastElement());

        animal.remove("Cat"); // remove(Object)
        System.out.println("After remove Cat: " + animal);

        animal.clear(); // clear()
        System.out.println("After clear(): " + animal);

        animal.empty(); // empty()
        System.out.println("Is stack empty now? " + animal.empty());
    }
}