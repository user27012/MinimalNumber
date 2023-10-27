import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> spisok = new LinkedList<>();
        spisok.add("WAKEUP");
        spisok.add("SCHOOL");
        spisok.add("RUST");
        spisok.add("WORK");
        spisok.add("REPEAT");

        LinkedList<String> doublelist = new LinkedList<>();

        for (String letter : spisok) {
            //Переменная doubleword будет принимать значение каджой буквы
            String doubleword = "";
            for (int i = 0; i < letter.length(); i++){
                char word = letter.charAt(i);
                //Отвечает за подвоение каждой буквы
                doubleword += word;
                doubleword += word;
            }
            //Отвечает за добовление каждого слова в список
            doublelist.add(doubleword);
        }
        //Тут Список выводится -
        for (String doubleword : doublelist) {
            System.out.println(doubleword);
        }
    }
}