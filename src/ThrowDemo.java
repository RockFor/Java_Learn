/**
 * Created by ����� on 08.03.2016.
 */
// ������������ ������������� ���������� ��� ������ ��������� throw
public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("������������!"); // �������� ���������� ������ Throwable
        }
        catch(NullPointerException exc) {
            /**/
            System.out.println("���������� ����������� � ������ demoproc().");
            throw exc;
        }
    }
    public static void main(String[] args) {
        try {
            demoproc();
        }
        catch (NullPointerException exc) {
            System.out.println("��������� �������� " + exc);
        }
    }
}
