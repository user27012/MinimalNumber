import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Создаем переменную что определит нужное количество чисел для массива
        int N = 10;
        //Запрашиваем числа, отправляем данные про наш масив
        LinkedList<Integer> integerList = getIntegerList(N);
        //Выводим полученные числа
        System.out.println("Случайные 10 чисел: ");
        for (Integer number : integerList) {
            System.out.print(number + ", " );
        }
        System.out.println("");
        //Тут получаем минимальное число
        System.out.println("Минимальное число: ");
        System.out.println(getMinimum(integerList));

    }

    public static LinkedList<Integer> getIntegerList(int N) {
        //Переносим наш массив, создаем рандом
        LinkedList<Integer> integerList = new LinkedList<>();
        Random random = new Random();

        //Цикл что отвечает за назначение объектов их случайными числами
        for (int i = 0; i < N; i++) {
            int randomNumber = random.nextInt(100);
            integerList.add(randomNumber);
        }
        //Возврощаем полученный результат
        return integerList;
    }
    public static int getMinimum(LinkedList<Integer> integerList){
        //Условия в случае ошибки
        if (integerList.isEmpty()){
            throw new IllegalArgumentException("Список пуст");
        }
        //Получения минимального числа
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(integerList); // Створюємо пріоритетну чергу

        //Возврат минимального числа
        return priorityQueue.peek();
    }

}

