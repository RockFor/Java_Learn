package p1;

/**
 * Created by ����� on 02.03.2016.
 */
class Delivered extends Protection {
    Delivered() {
        System.out.println("����������� ��������� Delivered ����������� Protection");
        System.out.println("n = " + n);                 // ����������� ����������� - ����� ������ � �������� �������� ������
        //System.out.println("n private = " + n_pri);   // ����� ������ � �������� ������ Protection
        System.out.println("n protected = " + n_pro);   // ����� ������ �� ��������� ������, �� ������ ���������� ������� ������
        System.out.println("n public = " + n_pub);      // ����� ������ �� ���� ����
    }
}
