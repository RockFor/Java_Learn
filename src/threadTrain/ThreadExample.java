package threadTrain;

/**
 * Created by Гость on 01.04.2016.
 */
class Example {
    void hello(int i) {
        System.out.println(Thread.currentThread().getName() + " " + i);
    }
}

class Realize implements Runnable {
    private boolean check; // Переключатель для цикла
    Example e;
    Realize(Example e, String name) { // Конструктор для создания и запуска потока
        this.e = e;
        new Thread(this, name).start();
    }
    public void run() { // Тело потока
        for (int i = 0; i < 5; i++) {
            try {
                check = false;
                synchronized (this) { // Синхронизированный блок
                    while (check) {
                        wait();
                    }
                    notify();
                }
                Thread.sleep(200);
            } catch(InterruptedException exc) {
                System.out.println(exc);
            }
            check = true;
            e.hello(i);
        }
    }

}

public class ThreadExample {
    public static void main(String[] args) {
        Example example = new Example();
        Realize realize0 = new Realize(example,"Первый поток");
        Realize realize1 = new Realize(example,"Второй поток");
    }
}
