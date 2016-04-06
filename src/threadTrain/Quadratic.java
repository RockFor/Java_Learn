package threadTrain;

/**
 * Created by Гость on 23.03.2016.
 */
class Solution {
    private int counter = 2;
    synchronized void one() {
        try {
            while(counter % 2 == 0) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Перехвачено исключение.");
        }
        System.out.println("Нечетное " + counter);
        counter++;
        notify();
    }

    synchronized  void two() {
        try {
            while(counter % 2 != 0) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Перехвачено исключение.");
        }
        System.out.println("Четное " + counter);
        counter++;
        notify();
    }
}

class FirstThread implements Runnable {
    private Solution solution;
    FirstThread(Solution s) {
        solution = s;
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            solution.one();
        }

    }
}

class SecondThread implements Runnable {
    private Solution solution;
    SecondThread(Solution s) {
        solution = s;
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            solution.two();
        }
    }
}



public class Quadratic {
    public static void main(String[] args) {
        Solution solution = new Solution();
        new FirstThread(solution);
        new SecondThread(solution);
    }
}
