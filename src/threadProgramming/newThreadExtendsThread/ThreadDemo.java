package threadProgramming.newThreadExtendsThread;

/**
 * Created by Гость on 21.03.2016.
 */
// Создание потока посредством наследования класса Thread
// Если мы не переопределяем никаких методов клааса Thread то лучше просто использовать интерфейс Runnable
class NewThread extends Thread {

    NewThread() {
        super("Demo thread"); // Передача имени потока в конструктор суперкласса
        System.out.println("Дочерний поток создан: " + getName());
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.println("Дочерний поток " + i);
            }
        } catch(InterruptedException exc) {}
        System.out.println("Дочерний поток завершен.");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new NewThread(); // Запуск нового потока
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Главный поток " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException exc) {}
        System.out.println("Главный поток завершен.");
    }
}
