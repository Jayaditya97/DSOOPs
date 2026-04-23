package LIST.ArrayList;
import java.lang.*;
import java.util.ArrayList;

public class demoRun {

    public static void main(String[] args) {

        ArrayList List = new ArrayList();
        List.add(10);
        List.add(20);
        List.add(10);

        System.out.println(List);

        for(Object o: List) {
            System.out.println(o + " ");
        }

        System.out.println(" ");
        for(int i = List.size() - 1; i>=0;i--){
            System.out.println(List.get(i));
        }
    }
}
