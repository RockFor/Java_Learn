/**
 * Created by ����� on 22.01.2016.
 */
// ������������ ���������� �������
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
    // ���������� ����� ������ ������
    void testInnerClassInMethod() {
        final int MAX_ITERATION = 10;
        for(int i = 0; i < MAX_ITERATION; i++) {
            class InnerInMethod {
                void display() {
                    System.out.println("����� outer_x: " + ++outer_x);
                }
            }
            InnerInMethod innerInMethod = new InnerInMethod();
            System.out.println(i + " " + innerInMethod);
            innerInMethod.display();
        }
    }
    // ���������� ����� �������������
    class Inner {
        void display() {
            System.out.println("����� outer_x: " + outer_x);
        }
    }
    // ���������� ����� �����������
    static class InnerStatic {
        Outer outer = new Outer(); // ��������� � ������������� ������ �������� ������ ���������� ����� ������
        void display() {
            System.out.println("����� �� ������������ ������ outer_x: " + outer.outer_x);
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
