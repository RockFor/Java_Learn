/**
 * Created by Гость on 06.03.2016.
 */
public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        }
        catch(ArithmeticException e) {
            System.out.println("Исключение: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение: " + e);
        }
        System.out.println("После блока опрераторов try/catch");
    }
}
