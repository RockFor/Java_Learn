
/**
 * Created by Гость on 12.03.2016.
 */
class NewThreadCreate implements Runnable {
    private final String nameOfThread; // Имя потока
    private final Thread t; // Ссылка для объекта потока

    NewThreadCreate(String nameOfThread) {
        this.nameOfThread = nameOfThread;
        t = new Thread(this, nameOfThread);
        t.start();
        System.out.println("Дочерний поток " + t + " создан");
    }
    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Дочерний поток " + nameOfThread + " " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException exc) {
            System.out.println("Дочерний поток" + nameOfThread + "прерван, причина " + exc);
        }
        System.out.println("Дочерний поток " + nameOfThread + " завершен");
    }

}

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThreadCreate("Один");
        new NewThreadCreate("Два");
        new NewThreadCreate("Три");
        System.out.println("Главный поток создан");
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Главный поток " + Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exc) {
            System.out.println("Главный поток " + Thread.currentThread().getName() + "прерван, причина " + exc);
        }
        System.out.println("Главный поток завершен");
    }
}
