/**
 * Created by ����� on 10.03.2016.
 */
import myexception.*;

public class ExceptionDemo {
    static void compute(int a) throws MyException { // �.�. ���������� �� ������ � ����� java.lang.* ���������� throws
        System.out.println("������ ����� compute[" + a + "]");
        if(a > 10) {
            throw new MyException("������"); // ���������� ����������� ����������
        }
        System.out.println("��� ������� ������ ������� ���������.");
    }

    public static void main(String[] args){
        try {
            compute(1);
            compute(20);
        }
        catch(MyException exc) {
            System.out.println(exc);
        }
    }
}
