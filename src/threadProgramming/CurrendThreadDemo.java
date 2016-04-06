package threadProgramming;

/**
 * Created by Гость on 20.03.2016.
 */
//Управление главным потоком
public class CurrendThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread().currentThread(); // Класс Thread создает ссылку на текущий поток
        System.out.println("Текущий поток " + t);
        t.setName("Главный поток"); // Присваиваем новое имя текущему потоку
        System.out.println("Новое имя текущего потока " + t);
        try {
            for (int i = 0; i < 5; i++) {
                t.sleep(100); // Генерирует исключение InterruptedException, если другой поток попытается прервать текущий
                System.out.println(i);
            }
        } catch(InterruptedException exc) {}
    }
}
