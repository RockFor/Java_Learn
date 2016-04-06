/**
 * Created by Гость on 08.03.2016.
 */
// Демонстрация применения оператора finally

public class FinallyDemo {
    // Сгенерировать исключение в методе
    static void procA() {
        try {
            System.out.println("procA()");
            throw new RuntimeException("demo");
        }
        finally {
            System.out.println("Блок оператора finally в теле метода procA()");
        }
    }
    // возвратить управление из блока оператора try
    static void procB() {
        try {
            System.out.println("procB()");
            return;
        }
        finally {
            System.out.println("Блок оператора finally в теле метода procB()");
        }

    }
    // выполнить блок try как обычно
    static void procC() {
        try {
            System.out.println("procC()");
        }
        finally {
            System.out.println("Блок оператора finally в теле метода procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }
        catch (Exception exc) {
            System.out.println("Исключение перехвачено " + exc);
        }
        procB();
        procC();
    }
}

