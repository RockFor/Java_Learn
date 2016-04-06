/**
 * Created by ����� on 12.03.2016.
 */
class NewThreadCreate_1 implements Runnable {
    private final String nameOfThread; // ��� ������
    protected final Thread t; // ������ ��� ������� ������

    NewThreadCreate_1(String nameOfThread) {
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

public class DemoJoin {
    public static void main(String[] args) {
        System.out.println("������� ����� ������");
        NewThreadCreate_1 ob1 = new NewThreadCreate_1("����");
        NewThreadCreate_1 ob2 = new NewThreadCreate_1("���");
        NewThreadCreate_1 ob3 = new NewThreadCreate_1("���");
        System.out.println("����� ���� �������: " + ob1.t.isAlive()); // ����� isAlive() ��������� ��������� �� �����
        System.out.println("����� ��� �������: " + ob2.t.isAlive());
        System.out.println("����� ��� �������: " + ob3.t.isAlive());
        // �������� ���������� �������
        try {
            System.out.println("�������� ���������� �������");
            ob1.t.join(); // ����� join() ������� ���������� ��������� ������, ����� ������������� � ��������
            ob2.t.join(); // ���� ����� ����������� �� ��� ������� ����� ����� �������� ���������
            ob3.t.join(); // ������� ����� ����, ���� ����������� ��������
            for(int i = 0; i < 5; i++) {
                System.out.println("������� ����� " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException exc) {
            System.out.println("������� ����� " + Thread.currentThread().getName() + "�������, ������� " + exc);
        }
        System.out.println("����� ���� �������: " + ob1.t.isAlive());
        System.out.println("����� ��� �������: " + ob2.t.isAlive());
        System.out.println("����� ��� �������: " + ob3.t.isAlive());
        System.out.println("������� ����� ��������");
    }
}

