/**
 * Created by ����� on 07.03.2016.
 */
public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / 1;
            System.out.println("a = " + a);
            try { // ��������� try
                a = 1;
                if(a == 1) a = a/(a-a); // ������ ���������� ����� �������� �������� �����, �.�. ��� �� ����� ����
                                        // ���������� ����������, ���� �� ������� ���� ����� ��� �� ����������
                                        // ���������� ����� �������� ���������� ������� Java
                if(a == 0) {
                    int[] c = {1};
                    c[42] = 99;
                }
            }
            catch(ArrayIndexOutOfBoundsException exc) {
                System.out.println("����������: " + exc);
            }
        }
        catch (ArithmeticException exc) {
            System.out.println("����������: " + exc);
        }
    }
}
