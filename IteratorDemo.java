import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    
    
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);
        List.add(60);
        List.add(70);
        List.add(80);
        List.add(90);
        List.add(100);
        
        for(int i=0;i< List.size();i++)
        {
            System.out.println("The Elements are "+List.get(i));
        }
        System.out.println("***********");
        
        for(Integer element: List)
            {
                System.out.println("The Elements are "+element);
            }
         System.out.println("***********");
        
        Iterator<Integer> it = List.iterator();

        while (it.hasNext()) {
            System.out.println("iterator "+it.next());
            
        }
    }
}

