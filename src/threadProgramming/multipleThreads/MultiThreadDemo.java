package threadProgramming.multipleThreads;

/**
 * Created by Гость on 21.03.2016.
 */
class NewThread implements Runnable {
    private String name;
    private Thread t;
    NewThread(String name) {
        this.name = name;
        t = new Thread(this,this.name);
        t.start();
        System.out.println("Поток " + name + " создан.");
    }

    Thread getRef() {
        return t;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException exc) {}
        System.out.println("Дочерний поток " + t.getName() + " завершен.");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread[] ob = {
                new NewThread("Первый"),
                new NewThread("Второй"),
                new NewThread("Третий")
        };

        for(NewThread t: ob) {
            System.out.println("Поток " + t.getRef().getName() + " запущен " + t.getRef().isAlive());
            // isAlive() проверяет выполняется ли поток для объекта
        }
        try {
            for(NewThread t: ob) {
                t.getRef().join(); // Главный поток находится в ожидании когда дочерний поток к нему присоединится
            }
        } catch(InterruptedException exc) {}
        for(NewThread t: ob) {
            System.out.println("Поток " + t.getRef().getName() + " запущен " + t.getRef().isAlive());
        }
        System.out.println("Главный поток завершен.");
    }
}
