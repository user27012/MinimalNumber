import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> spisok = new ArrayList<>();

        spisok.add(100);
        spisok.add(200);
        spisok.add(300);
        spisok.add(400);
        spisok.add(500);

        Iterator<Integer> iterator = spisok.iterator();

        while(iterator.hasNext()){
            Integer tmp = iterator.next();
            System.out.println(tmp);

        }

    }
}