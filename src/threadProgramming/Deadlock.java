package threadProgramming;

/**
 * Created by ����� on 24.03.2016.
 */
// �������� ����������
class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " ����� � �.foo");

        try {
            Thread.sleep(1000);
        } catch(Exception exc) {
            System.out.println("A ������� " + exc);
        }
        System.out.println(name + " �������� ������� B.last");
        b.last();
    }
    synchronized void last() {
        System.out.println("������ A.last");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " ����� � B.bar");

        try {
            Thread.sleep(1000);
        } catch(Exception exc) {
            System.out.println("B ������� " + exc);
        }
        System.out.println(name + " �������� ������� A.last");
        a.last();
    }
    synchronized void last() {
        System.out.println("������ B.last");
    }
}

public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();
    Deadlock() {
        Thread.currentThread().setName("������� �����.");
        Thread t = new Thread(this, "RacingThread");
        t.start();

        a.foo(b);
        System.out.println("����� � ������� �����.");
    }

    public void run() {
        b.bar(a);
        System.out.println("����� � ������ �����.");
    }

    public static void main(String[] args) {
        new Deadlock();
    }

}
