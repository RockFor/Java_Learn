/**
 * Created by ����� on 08.03.2016.
 */
// �������� try ����� ���� ������ ���������, �������� � ������

public class MethNestTry {
    static void NestTry(int x) {
        try {
            if(x == 1) {
                x = 42/(x-x);
            }
            if(x == 0) {
                int[] c = {1};
                c[42] = 99;
            }

            }
        catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("����������: " + exc);
        }
    }

    public static void main(String[] args) {
        int num = args.length + 0;
        try {
            if (num == 1) {
                num = 42 / 0;
            }
            NestTry(1);
        }
        catch(ArithmeticException exc) {
            System.out.println("����������: " + exc);
        }




    }
}
