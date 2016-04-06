/**
 * Created by Гость on 08.03.2016.
 */
public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne().");
        throw new IllegalAccessException("Демонстрация");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        }
        catch(Exception exc) {
            System.out.println("Перехвачено исключение: " + exc);
        }
    }
}
