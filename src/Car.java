import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car implements Comparable<Car> {
    private int speed;
    private double price;
    private String color;

    public Car(int speed, double price, String color) {
        this.speed = speed;
        this.price = price;
        this.color = color;
    }
        public static void main(String[] args) {
            List<Car> cars = new ArrayList<>();
            cars.add(new Car(200, 15000, "Red"));
            cars.add(new Car(180, 17000, "Blue"));
            cars.add(new Car(200, 20000, "Green"));
            cars.add(new Car(180, 15000, "Red"));

            Collections.sort(cars);

            for (Car car : cars) {
                System.out.println(car);
            }
        }

    // Сравнения - ниже

    @Override
    public int compareTo(Car other) {
        // Сначала тут сравниваю скорость
        int speedComparison = Integer.compare(this.speed, other.speed);
        if (speedComparison != 0) {
            return speedComparison;
        }

        // если скорость одинаковая тут будет считать по цене.
        int priceComparison = Double.compare(this.price, other.price);
        if (priceComparison != 0) {
            return priceComparison;
        }
        return this.color.compareTo(other.color);
    }
    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}