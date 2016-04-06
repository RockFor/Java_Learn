package Synch;

/**
 * Created by ����� on 18.03.2016.
 */
// ������ �� ������������������� ������ fold, ��� ������ ������������ ��������� � ������ �������, �������� ������������
// �������� ��� ����������, ��� ����� �������� � ������� � �������� ���������, �������� ����� synchronized �������� �������� �����
    // �������� ������ ������ ������� � ������, �� ����� ������������� ������ ������� �������.

class Call {
    int sum = 0,i = 0;
    void fold() {
        while(i++ < 10)
            System.out.println(Thread.currentThread() + " i = " + i);
        try {
            Thread.sleep(10);
        } catch(InterruptedException exc) {}
    }
}

class Caller implements Runnable {
    Thread thread;
    Call target;
    Caller(Call ob) {
        target = ob;
        thread = new Thread(this);
        thread.start();
    }
    public void run() {
        target.fold();
    }
}

public class Synch {
    public static void main(String[] args) {
        Call callOb = new Call();
        Caller thread0 = new Caller(callOb);
        Caller thread1 = new Caller(callOb);
        Caller thread2 = new Caller(callOb);

        try {
            thread0.thread.join();
            thread1.thread.join();
            thread2.thread.join();
        } catch(InterruptedException exc) {}
    }
}
