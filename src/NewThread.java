/**
 * Created by ����� on 11.03.2016.
 */
// �������� ������

public class NewThread implements Runnable { // �������� ��������� ����������� ����� run() ����������� �����
    NewThread() { // ����������� ����������
        // ������� ����� �����
        Thread t = new Thread(this,"���������������� �����"); // ������� ������ ���� Thread, this - ��������� ����� ��
                                                              // �������� �������
        System.out.println("�������� ����� ������ " + t); // ������� ��� ���������� ������
        t.start(); // ���� ����� ��������� ����� run(), ������� ���� Thread, ������� ��������� ����� �����
    }
    public void run() { // � ���� ������ ����������� ��� ��������������� ������ ������
        for (int i = 5; i > 0; i--) {
            try {
                System.out.println("�������� ����� " + i);
                Thread.sleep(500); // Thread ��������� �����, ������� ����� ������� ����������
            }
            catch(InterruptedException exc) {
                System.out.println("�������� ����� �������.");
            }
        }
        System.out.println("�������� ����� ��������.");
    }

}
class ThreadDemo {
    public static void main(String[] args) {
        new NewThread(); // ������� ������
        for (int i = 5; i > 0; i--) {
            try {
                System.out.println("������� ����� " + i);
                Thread.sleep(1000);
            }
            catch(InterruptedException exc) {
                System.out.println("������� ����� �������.");
            }
        }
        System.out.println("������� ����� ��������.");
    }
}
