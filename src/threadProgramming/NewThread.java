package threadProgramming;

/**
 * Created by ����� on 20.03.2016.
 */
// �������� ������ ����������� ���������� ���������� Runnable

class NewThread implements Runnable {
    Thread thread;
    NewThread() {
        thread = new Thread(this,"Demo thread");
        System.out.println("�������� ����� ������: " + thread.getName());
        thread.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.println("�������� ����� " + i);
            }
        } catch(InterruptedException exc) {}
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
    }
}