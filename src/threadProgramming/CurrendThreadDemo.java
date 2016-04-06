package threadProgramming;

/**
 * Created by ����� on 20.03.2016.
 */
//���������� ������� �������
public class CurrendThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread().currentThread(); // ����� Thread ������� ������ �� ������� �����
        System.out.println("������� ����� " + t);
        t.setName("������� �����"); // ����������� ����� ��� �������� ������
        System.out.println("����� ��� �������� ������ " + t);
        try {
            for (int i = 0; i < 5; i++) {
                t.sleep(100); // ���������� ���������� InterruptedException, ���� ������ ����� ���������� �������� �������
                System.out.println(i);
            }
        } catch(InterruptedException exc) {}
    }
}
