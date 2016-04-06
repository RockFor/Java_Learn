/**
 * Created by ����� on 08.03.2016.
 */
// ������������ ���������� ��������� finally

public class FinallyDemo {
    // ������������� ���������� � ������
    static void procA() {
        try {
            System.out.println("procA()");
            throw new RuntimeException("demo");
        }
        finally {
            System.out.println("���� ��������� finally � ���� ������ procA()");
        }
    }
    // ���������� ���������� �� ����� ��������� try
    static void procB() {
        try {
            System.out.println("procB()");
            return;
        }
        finally {
            System.out.println("���� ��������� finally � ���� ������ procB()");
        }

    }
    // ��������� ���� try ��� ������
    static void procC() {
        try {
            System.out.println("procC()");
        }
        finally {
            System.out.println("���� ��������� finally � ���� ������ procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }
        catch (Exception exc) {
            System.out.println("���������� ����������� " + exc);
        }
        procB();
        procC();
    }
}

