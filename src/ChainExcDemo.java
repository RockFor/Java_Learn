/**
 * Created by ����� on 10.03.2016.
 */
public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("������� �������");
        e.initCause(new ArithmeticException("�������"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }
        catch (Exception exc) {
            System.out.println("����������� ����������: " + exc);
            System.out.println("������������ ����������: " + exc.getCause());
        }
    }
}
