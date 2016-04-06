package myexception;

/**
 * Created by ����� on 10.03.2016.
 */
// �������� ������������ ����������

public class MyException extends Exception { // ���� ���������� ������ ���� ����������� ������ Exception
    private int details;
    private String errorMessage;
    private boolean choice;
    public MyException(int details) {
        this.details = details;
        choice = true;
    }
    public MyException(String errorMessage) {
        this.errorMessage = errorMessage;
        choice = false;
    }
    public String toString() {
        return choice ? "MyException[" + details +"]" : "MyException[" + errorMessage +"]" ;
    }
}
