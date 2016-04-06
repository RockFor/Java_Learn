package threadProgramming.newThreadExtendsThread;

/**
 * Created by ����� on 21.03.2016.
 */
// �������� ������ ����������� ������������ ������ Thread
// ���� �� �� �������������� ������� ������� ������ Thread �� ����� ������ ������������ ��������� Runnable
class NewThread extends Thread {

    NewThread() {
        super("Demo thread"); // �������� ����� ������ � ����������� �����������
        System.out.println("�������� ����� ������: " + getName());
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.println("�������� ����� " + i);
            }
        } catch(InterruptedException exc) {}
        System.out.println("�������� ����� ��������.");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new NewThread(); // ������ ������ ������
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("������� ����� " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException exc) {}
        System.out.println("������� ����� ��������.");
    }
}
