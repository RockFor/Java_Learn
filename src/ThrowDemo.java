/**
 * Created by Гость on 08.03.2016.
 */
// Демонстрация генерирования исключений при помощи оператора throw
public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("Демонстрация!"); // Создание экземпляра класса Throwable
        }
        catch(NullPointerException exc) {
            /**/
            System.out.println("Исключение перехвачено в методе demoproc().");
            throw exc;
        }
    }
    public static void main(String[] args) {
        try {
            demoproc();
        }
        catch (NullPointerException exc) {
            System.out.println("Повторный перехват " + exc);
        }
    }
}
