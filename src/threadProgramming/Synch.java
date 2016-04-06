package threadProgramming;

/**
 * Created by ����� on 21.03.2016.
 */
// ����� ��� �������������
class Callme {
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(100);
        } catch(InterruptedException exc) {
            System.out.println("��������.");
        }
        System.out.println("]");
    }
}

// ����� �������� ������
class Caller implements Runnable {
    private Thread t;
    private Callme ob;
    private String msg;
    Caller(Callme ob, String msg) {
        t = new Thread(this);
        this.msg = msg;
        this.ob = ob;
        t.start();
    }
    Thread getRef() {
        return t;
    }
    public void run() {
        ob.call(msg);
    }
}

public class Synch {
    public static void main(String[] args) {
        Callme ob = new Callme();
        Caller[] obC = {
                new Caller(ob, "����� ����������"),
                new Caller(ob, "� ������������������"),
                new Caller(ob, "���!"),
        };
        try {
            for(Caller i: obC) {
                i.getRef().join();
            }
        } catch (InterruptedException exc) {
            System.out.println("��������.");
        }
    }
}
