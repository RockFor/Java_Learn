/**
 * Created by ����� on 13.03.2016.
 */
class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(100);

        } catch (InterruptedException exc) {}
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run() {
        synchronized (target) { // ������ ����� ������� ��������� ���������� ������ ���������������
            target.call(msg);
            System.out.println("������� �����: " + Thread.currentThread());
        }
    }
}

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "����� ����������");
        Caller ob2 = new Caller(target, "� ������������������");
        Caller ob3 = new Caller(target, "���!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException ext) {}
    }
}
