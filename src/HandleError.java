/**
 * Created by Гость on 06.03.2016.
 */
import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a, b, c;
        a = b = c = 0;
        Random rand = new Random();
        for (int i = 0; i < 32000; i++) {
            try {
                b = rand.nextInt();
                c = rand.nextInt();
                a = 12345 / (b / c);
            }
            catch (ArithmeticException exc) {
                System.out.println("Исключение: " + exc);
                a = 0;
            }
            System.out.println("a = " + a);
        }
    }
}
