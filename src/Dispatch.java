/**
 * Created by ����� on 16.02.2016.
 */
// ������������ ��������������� �������
class A3 {
    static int counter = 1;
    A3() {
        System.out.println("������ ������������ ������ A");
        System.out.println("������������ ������ A ������ " + counter + " ���");
        counter++;
    }
    void callme() {
        System.out.println("������ ������ callme ������ A");
    }
}
class B3 extends A3 {
    static int counter1 = 0;
    B3() {
        System.out.println("������ ������������ ������ B");
        System.out.println("������������ ������ B ������ " + counter1 + " ���");
        counter1++;
    }
    void callme() {
        System.out.println("������ ������ callme ������ B");
    }
}
class C3 extends A3 {
    static int counter2 = 0;
    C3() {
        System.out.println("������ ������������ ������ C");
        System.out.println("������������ ������ � ������ " + counter2 + " ���");
        counter2++;
    }
    void callme() {
        System.out.println("������ ������ callme ������ C");
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
