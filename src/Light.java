/**
 * Created by Гость on 29.10.2015.
 */
// Вычисление расстояния проходимого светом
public class Light {
    public static void main(String[] args) {
        int lightspeed;
        int days;
        int seconds;
        long distance;

        // Приблизительная скорость света в милях
        lightspeed = 186000;
        days = 1000; // Указание количества дней
        seconds = days * 24 * 60 * 60; // секунды
        distance = (long)lightspeed * seconds; // расстояние
        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.print(distance + " миль");
    }
}
