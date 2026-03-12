package LIST.Hash;
import java.util.HashSet;
import java.util.Iterator;

public class demo {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // Adding 5 values
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        // Printing size of set
        System.out.println("Size of set: " + set.size());

        System.out.println(set);

        for (Integer v: set){
            System.out.println(v);
        }

        System.out.println(" ");

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashSet<Integer> toRemove = new HashSet<>();
        toRemove.add(10);
    }
}