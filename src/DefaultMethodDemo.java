/**
 * Created by ����� on 06.03.2016.
 */
// Java 8 ���������� � ����������� ������� �� ���������
interface MyIF {
    int getNumber(); // ������� ����� ��� ����, ������� ���������� ����������� � ������
    default String getString() { // ����� �� ��������� � �����, ��� ������������� ������������� � ������
        return "������ ���� String �� ���������!";
    }
    static int getDefaultNumber() { // ����������� �����
        return 0;
    }
}

class MyIFImp implements MyIF {
    public int getNumber() {
        return 100;
    }
    public String getString() {
        return "������ ���� String!";
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
    }
}
