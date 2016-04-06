package threadProgramming;

/**
 * Created by Гость on 20.03.2016.
 */
// Создание потока посредством реализации интерфейса Runnable

class NewThread implements Runnable {
    Thread thread;
    NewThread() {
        thread = new Thread(this,"Demo thread");
        System.out.println("Дочерний поток создан: " + thread.getName());
        thread.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.println("Дочерний поток " + i);
            }
        } catch(InterruptedException exc) {}
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
    }
}