/**
 * Created by ����� on 19.03.2016.
 */
class Q {
    private int n;
    private boolean valueSet = false;

    synchronized int get() {
        //while(!valueSet)
        notify();
            try {
                wait();
            } catch (InterruptedException exc) {
                System.out.println("������� ��������� InterruptedException.");
            }
        System.out.println("��������: " + n);
        valueSet = false;

        return n;
    }
    synchronized void put(int n) {
        //while(valueSet)
        notify();
        try {
            wait();
        } catch (InterruptedException exc) {
            System.out.println("������� ��������� InterruptedException.");
        }
        this.n = n;
        valueSet = true;
        notify();
        System.out.println("����������: " + n);
    }
}

class Producer implements Runnable {
    Q q;
    Producer(Q q) {
        this.q = q;
        new Thread(this, "���������").start();
    }

    public void run() {
        int i = 0;
        while(true) {
            q.put(i++);
        }
    }

}

class Consumer implements Runnable {
    Q q;
    Consumer(Q q) {
        this.q = q;
        new Thread(this, "�����������").start();
    }

    public void run() {
        while(true) {
            q.get();
        }
    }
}

public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
