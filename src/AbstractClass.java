/**
 * Created by ����� on 01.03.2016.
 */
abstract class A5 {
    abstract void callme();

    void callmetoo() {
        System.out.println("��� ���������� �����.");
    }
}
class B5 extends A5 {
    void callme() {
        System.out.println("���������� ������ callme() � ������ B.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        B5 b = new B5();
        b.callme();
        b.callmetoo();
    }
}
