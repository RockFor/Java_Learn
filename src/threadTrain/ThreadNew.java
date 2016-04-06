package threadTrain;

/**
 * Created by Гость on 26.03.2016.
 */
enum Number {
    ONE(1), TWO(2), ONE_DOUBLE(1.5), TWO_DOUBLE(2.0);
    private int n;
    private double nDouble;
    Number(int n) {
        this.n = n;
    }
    Number(double n) {
        nDouble = n;
    }
    int getNum(int i) {
        return n;
    }
    double getNum(double i) {
        return nDouble;
    }
}

class Calculator {
    private int resultInt = 0;
    private double resultDouble = 0;
    private int sleep = 0;
    synchronized int add(int n) {
        resultInt += n;
        try {
            while (sleep == 1) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        sleep = 1;
        notify();
        return resultInt;
    }
    synchronized  int minus(int n) {
        resultInt -= n;
        return resultInt;
    }
    synchronized double add(double n) {
        resultDouble += n;
        try {
            while (sleep == 2) {

                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        sleep = 2;
        notify();
        return resultDouble;
    }
    synchronized double minus(double n) {
        resultDouble -= n;
        return resultDouble;
    }
}

class CalThread implements Runnable {
    private Thread t;
    private Calculator c;
    private double numDouble;
    private int numInt;
    CalThread(Calculator c, int numInt, String name) {
        this.c = c;
        this.numInt = numInt;
        t = new Thread(this,name);
        t.start();
    }
    CalThread(Calculator c, double numDouble, String name) {
        this.c = c;
        this.numDouble = numDouble;
        t = new Thread(this,name);
        t.start();
    }

    void waitToJoin() throws InterruptedException {
        t.join();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            }catch (Exception exc) {
                System.out.println();
            }
            System.out.println(Thread.currentThread().getName() + " add " + c.add(numInt)+ "|");
            System.out.println(Thread.currentThread().getName() + " add " + c.add(numDouble));
        }
    }

}

public class ThreadNew {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        CalThread calThread1 = new CalThread(calc,Number.ONE.getNum(1),"Целый поток");
        CalThread calThread2 = new CalThread(calc,Number.ONE_DOUBLE.getNum(1),"Дробный поток");
        try {
            calThread1.waitToJoin();
            calThread2.waitToJoin();
        } catch (InterruptedException exc) {

        }
    }
}
