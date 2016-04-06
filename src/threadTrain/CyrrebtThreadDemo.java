package threadTrain;

/**
 * Created by Гость on 11.03.2016.
 */
// Демонстрация управления главным потоком, в многопоточном программировании Java

public class CyrrebtThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();  // Получить ссылку на текущий поток
        System.out.println("Текущий поток " + t);
        t.setName("Мой Thread"); //
        System.out.println("Новое имя потока" + t);
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000); // Приостанавлиевает выполнение потока на указанное кол-во мс.
            }
        }
        catch (InterruptedException exc) {
            System.out.println("Главный поток прерван");
        }

    }
}
