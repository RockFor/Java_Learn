
/**
 * Created by ����� on 12.03.2016.
 */
class NewThreadCreate implements Runnable {
    private final String nameOfThread; // ��� ������
    private final Thread t; // ������ ��� ������� ������

    NewThreadCreate(String nameOfThread) {
        this.nameOfThread = nameOfThread;
        t = new Thread(this, nameOfThread);
        t.start();
        System.out.println("�������� ����� " + t + " ������");
    }
    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("�������� ����� " + nameOfThread + " " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException exc) {
            System.out.println("�������� �����" + nameOfThread + "�������, ������� " + exc);
        }
        System.out.println("�������� ����� " + nameOfThread + " ��������");
    }

}

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThreadCreate("����");
        new NewThreadCreate("���");
        new NewThreadCreate("���");
        System.out.println("������� ����� ������");
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("������� ����� " + Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exc) {
            System.out.println("������� ����� " + Thread.currentThread().getName() + "�������, ������� " + exc);
        }
        System.out.println("������� ����� ��������");
    }
}
