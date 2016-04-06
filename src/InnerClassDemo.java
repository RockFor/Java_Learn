/**
 * Created by Гость on 22.01.2016.
 */
// Демонстрация внутренних классов
class Outer {
    private int outer_x = 100;
    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    void testStaticClass() {
        InnerStatic innerStatic = new InnerStatic();
        innerStatic.display();
    }
    // Внутренний класс внутри метода
    void testInnerClassInMethod() {
        final int MAX_ITERATION = 10;
        for(int i = 0; i < MAX_ITERATION; i++) {
            class InnerInMethod {
                void display() {
                    System.out.println("Вывод outer_x: " + ++outer_x);
                }
            }
            InnerInMethod innerInMethod = new InnerInMethod();
            System.out.println(i + " " + innerInMethod);
            innerInMethod.display();
        }
    }
    // Внутренний класс нестатический
    class Inner {
        void display() {
            System.out.println("Вывод outer_x: " + outer_x);
        }
    }
    // Внутренний класс статический
    static class InnerStatic {
        Outer outer = new Outer(); // Обращения к нестатическим членам внешнего класса происходит через объект
        void display() {
            System.out.println("Вывод из статического класса outer_x: " + outer.outer_x);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outerClassObject = new Outer();
        outerClassObject.test();
        outerClassObject.testStaticClass();
        System.out.println("--------------------------------------");
        outerClassObject.testInnerClassInMethod();
    }
}
