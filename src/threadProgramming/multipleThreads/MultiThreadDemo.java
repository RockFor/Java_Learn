package threadProgramming.multipleThreads;

/**
 * Created by ����� on 21.03.2016.
 */
class NewThread implements Runnable {
    private String name;
    private Thread t;
    NewThread(String name) {
        this.name = name;
        t = new Thread(this,this.name);
        t.start();
        System.out.println("����� " + name + " ������.");
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
        System.out.println("�������� ����� " + t.getName() + " ��������.");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread[] ob = {
                new NewThread("������"),
                new NewThread("������"),
                new NewThread("������")
        };

        for(NewThread t: ob) {
            System.out.println("����� " + t.getRef().getName() + " ������� " + t.getRef().isAlive());
            // isAlive() ��������� ����������� �� ����� ��� �������
        }
        try {
            for(NewThread t: ob) {
                t.getRef().join(); // ������� ����� ��������� � �������� ����� �������� ����� � ���� �������������
            }
        } catch(InterruptedException exc) {}
        for(NewThread t: ob) {
            System.out.println("����� " + t.getRef().getName() + " ������� " + t.getRef().isAlive());
        }
        System.out.println("������� ����� ��������.");
    }
}
