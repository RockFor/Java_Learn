/**
 * Created by Гость on 16.02.2016.
 */
// Динамическая диспетчеризация методов
class A3 {
    static int counter = 1;
    A3() {
        System.out.println("Внутри конструктора класса A");
        System.out.println("Конструктора класса A вызван " + counter + " раз");
        counter++;
    }
    void callme() {
        System.out.println("Внутри метода callme класса A");
    }
}
class B3 extends A3 {
    static int counter1 = 0;
    B3() {
        System.out.println("Внутри конструктора класса B");
        System.out.println("Конструктора класса B вызван " + counter1 + " раз");
        counter1++;
    }
    void callme() {
        System.out.println("Внутри метода callme класса B");
    }
}
class C3 extends A3 {
    static int counter2 = 0;
    C3() {
        System.out.println("Внутри конструктора класса C");
        System.out.println("Конструктора класса С вызван " + counter2 + " раз");
        counter2++;
    }
    void callme() {
        System.out.println("Внутри метода callme класса C");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A3 a = new A3();
        B3 b = new B3();
        C3 c = new C3();

        A3 r;
        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}
