/**
 * Created by ����� on 06.03.2016.
 */
// ��������� ����������

public class Ex2 {
    public static void main(String[] args) {
        int d, a;
        try { // ����������������� ���� ����
            d = 0;
            a = 42 / d;
        }
        catch (ArithmeticException e) { // ����������� ������ ������� �� ����
            System.out.println("������� �� ����!");
        }
        System.out.println("����� ��������� catch.");
    }
}
