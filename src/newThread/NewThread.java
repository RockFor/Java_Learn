package newThread;

/**
 * Created by ����� on 12.03.2016.
 */
// ����� ����� � ������ ��� ������ ExtendsThread

public class NewThread extends Thread {
    public NewThread() {
        //super("���������������� �����");
        System.out.println("�������� ����� ������ " + this);
        start();
    }
    public void run() {
        try {
            for (int i = 5; i-- > 1;) {
                System.out.println("�������� ����� " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException exc) {
            System.out.println("�������� ����� ������� ������.");
        }
        System.out.println("�������� ����� ��������.");
    }
}
