package p2;

/**
 * Created by ����� on 02.03.2016.
 */
public class Protection2 extends p1.Protection {
    public Protection2() {
        System.out.println("����������� ��������� Protection2 ����������� p1.Protection");
        //System.out.println("n = " + n);                 // ����������� ����������� - ����� ������ � �������� �������� ������ p1
        //System.out.println("n private = " + n_pri);   // ����� ������ � �������� ������ Protection
        System.out.println("n protected = " + n_pro);   // ����� ������ �� ��������� ������, �� ������ ���������� ������� ������
        System.out.println("n public = " + n_pub);      // ����� ������ �� ���� ����
    }
}

class OtherPackage {
    OtherPackage() {
       Protection2 p = new Protection2();
        System.out.println("����������� ������ OtherPackage");
        //System.out.println("n = " + p.n);                 // ����������� ����������� - ����� ������ � �������� �������� ������ p1
        //System.out.println("n private = " + n_pri);   // ����� ������ � �������� ������ Protection
        //System.out.println("n protected = " + p.n_pro);   // ����� ������ �� ��������� ������, �� ������ ���������� ������� ������
        System.out.println("n public = " + p.n_pub);      // ����� ������ �� ���� ����
    }
}