/**
 * Created by Гость on 11.03.2016.
 */
// Создание потока

public class NewThread implements Runnable { // Наледуем интерфейс описывающий метод run() запускающий поток
    NewThread() { // Конструктор экземпляра
        // Создать новый поток
        Thread t = new Thread(this,"Демонстрационный поток"); // Создаем объект типа Thread, this - формирует поток из
                                                              // текущего объекта
        System.out.println("Дочерний поток создан " + t); // Выводим имя созданного потока
        t.start(); // Этот метод запускает метод run(), объекта типа Thread, который запускает новый поток
    }
    public void run() { // В теле метода выполняется код соответствующий новому потоку
        for (int i = 5; i > 0; i--) {
            try {
                System.out.println("Дочерний поток " + i);
                Thread.sleep(500); // Thread статичный класс, который может вызвать исключение
            }
            catch(InterruptedException exc) {
                System.out.println("Дочерний поток прерван.");
            }
        }
        System.out.println("Дочерний поток завершен.");
    }

}
class ThreadDemo {
    public static void main(String[] args) {
        new NewThread(); // Создаем объект
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
