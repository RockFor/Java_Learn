package p1;

/**
 * Created by ����� on 02.03.2016.
 */
class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("����������� ������ SamePackage");
        System.out.println("n = " + p.n);                 // ����������� ����������� - ����� ������ � �������� �������� ������
        //System.out.println("n private = " + p.n_pri);   // ����� ������ � �������� ������ Protection
        System.out.println("n protected = " + p.n_pro);   // ����� ������ �� ��������� ������, �� ������ ���������� ������� ������
        System.out.println("n public = " + p.n_pub);      // ����� ������ �� ���� ����
    }
}
