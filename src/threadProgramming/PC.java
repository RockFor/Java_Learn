package threadProgramming;

/**
 * Created by ����� on 22.03.2016.
 */
// ������������� ������� wait() � notify()
class Q {
    private int n;
    private boolean valueSet = false; // �������������
    private int get = 0, put = 0;
    synchronized int get() {
        System.out.println("\n������ get() ������� " + Thread.currentThread());
        System.out.println("����� get() ������ " + ++get + " ���");
        try {
            while (!valueSet) { // �� ������ ������ ������ get() ������� Customer ��������� ����� Customer � ����� ��������
                System.out.println("����� ���������� " + Thread.currentThread() + "\n");
                this.notify(); // �������� ������, �������-������ Producer
                wait(); // ����� ��������� � ����� �������� � ����������� ������� ������� ������ Q ��� ������� ������
                // ��� ��� ����� Customer ������ ������ � ������� � ����� ��������, ����� Producer ���������� ���� ������
                System.out.println("����� ���������� ������ " + Thread.currentThread() + "\n");
            }
        } catch (InterruptedException exc) {
            System.out.println("����������� InterruptedException");
        }
        System.out.println("get() �������� �� ������ " + Thread.currentThread() + " " + n + " valueSet " + valueSet);
        valueSet = false; // ��������������� ��� ������ ������ ������ � ������ ������� Customer

        System.out.println("������ ����� notify() � ������ get()");

        return n;
    }

    synchronized void put(int n) {
        System.out.println("\n������ put() ������� " + Thread.currentThread() + " �������� n " + n);
        System.out.println("����� put() ������ " + ++put + " ���");
        try {
            while(valueSet) {
                System.out.println("����� ���������� " + Thread.currentThread() + "\n");
                this.notify();
                wait(); // ����� ��������� � ����� �������� � ����������� ������� �������
                System.out.println("����� ���������� ������ " + Thread.currentThread() + "\n");
            }
        } catch (InterruptedException exc) {
            System.out.println("����������� InterruptedException");
        }
        this.n = n;
        System.out.println("put() ���������� �� ������ " + Thread.currentThread() + " " + n + " valueSet " + valueSet);
        valueSet = true;

        System.out.println("������ ����� notify() � ������ put()");

    }
}

class Producer implements Runnable {
    private final Q q;
    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        int j = 0;
        while(j++ < 5) {
            q.put(i++);
        }
    }
}

class Customer implements Runnable {
    private final Q q;
    Customer(Q q) {
        this.q = q;
        new Thread(this, "Customer").start();
    }

    public void run() {
        int j = 0;
        while(j++ < 5) {
            q.get();
        }
    }
}

public class PC {
    public static void main(String[] args) {
        Q q = new Q();

        new Producer(q);
        new Customer(q);
    }
}
