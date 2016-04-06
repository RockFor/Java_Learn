package p1;
/**
 * Created by ����� on 02.03.2016.
 */
import MyPack.*;

public class Protection {
    int n = 1;                  // ����������� ����������� - ����� ������ � �������� �������� ������
    private int n_pri = 2;      // ����� ������ � �������� ������
    protected int n_pro = 3;    // ����� ������ �� ��������� ������, �� ������ ���������� ������� ������
    public int n_pub = 4;       // ����� ������ �� ���� ����
    private static int counter = 0x0; // ������� ��� �������� ������ ������������ ��� ������������

    public Protection() {
        Balance b = new Balance("J. Jillian",-10.1);
        counter++;
        System.out.println("����������� �������� ������! (Protection) ������ " + counter + " ���");
        System.out.println("n = " + n);
        System.out.println("n private = " + n_pri);
        System.out.println("n protected = " + n_pro);
        System.out.println("n public = " + n_pub);
        b.show();
    }
}
