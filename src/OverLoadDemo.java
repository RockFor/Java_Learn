/**
 * Created by Гость on 21.01.2016.
 */
// Демонтрация перегрузки методов.
public class OverLoadDemo {
    void test() {
        System.out.println("Without parameters!");
    }
    // Проверка перегрузки при наличии одного целочисленного объекта
    void test(int a) {
        System.out.println("a: " + a);
    }
    // Проверка перегрузки при наличии двух целочисленных объектов
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }
    // Проверка перегрузки при наличии параметра типа double
    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}
class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo(); // создаем экземпляр (объект) класса OverLoadDemo
        double result; // Переменная для возврата значения из метода класса OverLoadDemo

        // Вызов всех версий метода test()
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("Результат ob.test(123.25): " + result);
    }
}
