/**
 * Created by ����� on 29.10.2015.
 */
// ���������� ���������� ����������� ������
public class Light {
    public static void main(String[] args) {
        int lightspeed;
        int days;
        int seconds;
        long distance;

        // ��������������� �������� ����� � �����
        lightspeed = 186000;
        days = 1000; // �������� ���������� ����
        seconds = days * 24 * 60 * 60; // �������
        distance = (long)lightspeed * seconds; // ����������
        System.out.print("�� " + days);
        System.out.print(" ���� ���� ������� ����� ");
        System.out.print(distance + " ����");
    }
}
