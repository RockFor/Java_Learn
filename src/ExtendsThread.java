/**
 * Created by Гость on 12.03.2016.
 */
import newThread.NewThread;

/*
* public class NewThread extends Thread {
    public NewThread() {
        super("Демонстрационный поток");
        System.out.println("Дочерний поток создан " + this);
        start();
    }
    public void run() {
        try {
            for (int i = 5; i-- > 1;) {
                System.out.println("Дочерний поток " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException exc) {
            System.out.println("Дочерний поток прервал работу.");
        }
        System.out.println("Дочерний поток завершен.");
    }
}
* */

public class ExtendsThread {
    public static void main(String[] args) {
        new NewThread();
        for (int i = 5; i > 0; i--) {
            try {
                System.out.println("Главный поток " + i);
                Thread.sleep(1000);
            }
            catch(InterruptedException exc) {
                System.out.println("Главный поток прерван.");
            }
        }
        System.out.println("Главный поток завершен.");
    }

}
