package threadProgramming;

/**
 * Created by Гость on 22.03.2016.
 */
// Использование методов wait() и notify()
class Q {
    private int n;
    private boolean valueSet = false; // Переключатель
    private int get = 0, put = 0;
    synchronized int get() {
        System.out.println("\nВызван get() потоком " + Thread.currentThread());
        System.out.println("Всего get() вызван " + ++get + " раз");
        try {
            while (!valueSet) { // На втором вызове метода get() потоком Customer переводит поток Customer в режим ожидания
                System.out.println("Поток остановлен " + Thread.currentThread() + "\n");
                this.notify(); // Посылает сигнал, объекту-потока Producer
                wait(); // Поток переходит в режим ожидания и освобождает монитор объекта класса Q для второго потока
                // Так как поток Customer послал сигнал и перешел в режим ожидания, поток Producer продолжает свою работу
                System.out.println("Поток продолжает работу " + Thread.currentThread() + "\n");
            }
        } catch (InterruptedException exc) {
            System.out.println("Перехвачено InterruptedException");
        }
        System.out.println("get() Получено из потока " + Thread.currentThread() + " " + n + " valueSet " + valueSet);
        valueSet = false; // Устанавливается при втором вызове метода в потоке объекта Customer

        System.out.println("Вызван метод notify() в методе get()");

        return n;
    }

    synchronized void put(int n) {
        System.out.println("\nВызван put() потоком " + Thread.currentThread() + " значение n " + n);
        System.out.println("Всего put() вызван " + ++put + " раз");
        try {
            while(valueSet) {
                System.out.println("Поток остановлен " + Thread.currentThread() + "\n");
                this.notify();
                wait(); // Поток переходит в режим ожидания и освобождает монитор объекта
                System.out.println("Поток продолжает работу " + Thread.currentThread() + "\n");
            }
        } catch (InterruptedException exc) {
            System.out.println("Перехвачено InterruptedException");
        }
        this.n = n;
        System.out.println("put() Отправлено из потока " + Thread.currentThread() + " " + n + " valueSet " + valueSet);
        valueSet = true;

        System.out.println("Вызван метод notify() в методе put()");

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
