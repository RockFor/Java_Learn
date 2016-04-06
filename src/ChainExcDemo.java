/**
 * Created by Гость on 10.03.2016.
 */
public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("верхний уровень");
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }
        catch (Exception exc) {
            System.out.println("Перехвачено исключение: " + exc);
            System.out.println("Первопричина исключения: " + exc.getCause());
        }
    }
}
