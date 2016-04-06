/**
 * Created by ����� on 21.01.2016.
 */
// ����������� ���������� �������.
public class OverLoadDemo {
    void test() {
        System.out.println("Without parameters!");
    }
    // �������� ���������� ��� ������� ������ �������������� �������
    void test(int a) {
        System.out.println("a: " + a);
    }
    // �������� ���������� ��� ������� ���� ������������� ��������
    void test(int a, int b) {
        System.out.println("a � b: " + a + " " + b);
    }
    // �������� ���������� ��� ������� ��������� ���� double
    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}
class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo(); // ������� ��������� (������) ������ OverLoadDemo
        double result; // ���������� ��� �������� �������� �� ������ ������ OverLoadDemo

        // ����� ���� ������ ������ test()
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("��������� ob.test(123.25): " + result);
    }
}
