package p1;
/**
 * Created by Гость on 02.03.2016.
 */
import MyPack.*;

public class Protection {
    int n = 1;                  // Модификатор отсутствует - имеет доступ в пределах текущего пакета
    private int n_pri = 2;      // Имеет доступ в пределах класса
    protected int n_pro = 3;    // Имеет доступ за пределами пакета, но только подклассам данного класса
    public int n_pub = 4;       // Имеет доступ во всем коде
    private static int counter = 0x0; // Счетчик для подсчета вызова конструктора при наследовании

    public Protection() {
        Balance b = new Balance("J. Jillian",-10.1);
        counter++;
        System.out.println("Конструктор базового класса! (Protection) вызван " + counter + " раз");
        System.out.println("n = " + n);
        System.out.println("n private = " + n_pri);
        System.out.println("n protected = " + n_pro);
        System.out.println("n public = " + n_pub);
        b.show();
    }
}
