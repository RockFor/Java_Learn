package threadTrain;

/**
 * Created by ����� on 11.03.2016.
 */
// ������������ ���������� ������� �������, � ������������� ���������������� Java

public class CyrrebtThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();  // �������� ������ �� ������� �����
        System.out.println("������� ����� " + t);
        t.setName("��� Thread"); //
        System.out.println("����� ��� ������" + t);
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000); // ����������������� ���������� ������ �� ��������� ���-�� ��.
            }
        }
        catch (InterruptedException exc) {
            System.out.println("������� ����� �������");
        }

    }
}
