/**
 * Created by Гость on 13.03.2016.
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
        synchronized (target) { // Каждый поток ожидает окончания выполнения своего предшественника
            target.call(msg);
            System.out.println("Текущий поток: " + Thread.currentThread());
        }
    }
}

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Добро пожаловать");
        Caller ob2 = new Caller(target, "в синхронизированный");
        Caller ob3 = new Caller(target, "мир!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException ext) {}
    }
}
