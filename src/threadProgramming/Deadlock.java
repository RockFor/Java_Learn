package threadProgramming;

/**
 * Created by Гость on 24.03.2016.
 */
// Взаимная блокировка
class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в А.foo");

        try {
            Thread.sleep(1000);
        } catch(Exception exc) {
            System.out.println("A прерван " + exc);
        }
        System.out.println(name + " пытается вызвать B.last");
        b.last();
    }
    synchronized void last() {
        System.out.println("Внутри A.last");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в B.bar");

        try {
            Thread.sleep(1000);
        } catch(Exception exc) {
            System.out.println("B прерван " + exc);
        }
        System.out.println(name + " пытается вызвать A.last");
        a.last();
    }
    synchronized void last() {
        System.out.println("Внутри B.last");
    }
}

public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();
    Deadlock() {
        Thread.currentThread().setName("Главный поток.");
        Thread t = new Thread(this, "RacingThread");
        t.start();

        a.foo(b);
        System.out.println("Назад в главный поток.");
    }

    public void run() {
        b.bar(a);
        System.out.println("Назад в другой поток.");
    }

    public static void main(String[] args) {
        new Deadlock();
    }

}
