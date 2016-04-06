/**
 * Created by Гость on 12.03.2016.
 */
class NewThreadCreate_1 implements Runnable {
    private final String nameOfThread; // Имя потока
    protected final Thread t; // Ссылка для объекта потока

    NewThreadCreate_1(String nameOfThread) {
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

public class DemoJoin {
    public static void main(String[] args) {
        System.out.println("Главный поток создан");
        NewThreadCreate_1 ob1 = new NewThreadCreate_1("Один");
        NewThreadCreate_1 ob2 = new NewThreadCreate_1("Два");
        NewThreadCreate_1 ob3 = new NewThreadCreate_1("Три");
        System.out.println("Поток Один запущен: " + ob1.t.isAlive()); // Метод isAlive() проверяет протекает ли поток
        System.out.println("Поток Два запущен: " + ob2.t.isAlive());
        System.out.println("Поток Три запущен: " + ob3.t.isAlive());
        // Ожидание завершения потоков
        try {
            System.out.println("Ожидание завершения потоков");
            ob1.t.join(); // Метод join() ожидает завершения дочернего потока, чтобы присоединится к главному
            ob2.t.join(); // этот метод гарантирует то что главный поток будет завершен последнем
            ob3.t.join(); // Главный поток ждет, пока исполняется дочерний
            for(int i = 0; i < 5; i++) {
                System.out.println("Главный поток " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException exc) {
            System.out.println("Главный поток " + Thread.currentThread().getName() + "прерван, причина " + exc);
        }
        System.out.println("Поток Один запущен: " + ob1.t.isAlive());
        System.out.println("Поток Два запущен: " + ob2.t.isAlive());
        System.out.println("Поток Три запущен: " + ob3.t.isAlive());
        System.out.println("Главный поток завершен");
    }
}

