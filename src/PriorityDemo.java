/**
 * Created by ����� on 13.03.2016.
 */
class Priority implements Runnable {
    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;

    Priority(String name) {
        thrd = new Thread(this,name);
        currentName = name;
        count = 0;
    }

    public void run() {
        System.out.println(thrd.getName() + " ���������");
        do {
            if(currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println(thrd.getName() + " " + count);
            }
        }
        while(!stop & ++count < 1000);
        stop = true;
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        Priority obj1 = new Priority("������� ���������");
        Priority obj2 = new Priority("������ ���������");

        obj1.thrd.setPriority(Thread.NORM_PRIORITY);
        obj2.thrd.setPriority(Thread.NORM_PRIORITY);

        obj1.thrd.start();
        obj2.thrd.start();

        try {
            obj1.thrd.join();
            obj2.thrd.join();
        }
        catch(InterruptedException exc) {}
        System.out.println("������ ����� �������� ����� " + obj1.count);
        System.out.println("������ ����� �������� ����� " + obj2.count);
    }
}
