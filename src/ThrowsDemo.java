/**
 * Created by ����� on 08.03.2016.
 */
public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("� ���� ������ throwOne().");
        throw new IllegalAccessException("������������");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        }
        catch(Exception exc) {
            System.out.println("����������� ����������: " + exc);
        }
    }
}
