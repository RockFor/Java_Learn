/**
 * Created by Гость on 10.03.2016.
 */
import myexception.*;

public class ExceptionDemo {
    static void compute(int a) throws MyException { // т.к. исключение не входит в пакет java.lang.* используем throws
        System.out.println("Вызван метод compute[" + a + "]");
        if(a > 10) {
            throw new MyException("Привет"); // генерируем собственное исключение
        }
        System.out.println("Все системы метода успешно завершены.");
    }

    public static void main(String[] args){
        try {
            compute(1);
            compute(20);
        }
        catch(MyException exc) {
            System.out.println(exc);
        }
    }
}
