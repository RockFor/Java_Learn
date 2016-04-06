package newThread;

/**
 * Created by Гость on 12.03.2016.
 */
// Новый паток в пакете для класса ExtendsThread

public class NewThread extends Thread {
    public NewThread() {
        //super("Демонстрационный поток");
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
