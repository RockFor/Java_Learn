/**
 * Created by ����� on 22.01.2016.
 */
// ������������ ������������� ������ ���������� ���������� �����
public class VarArgs {
    // ���������� �������
        static void vaTest(int ... v) {
        System.out.print("���������� ����������: " + v.length + " ����������: ");
        for(int x: v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void vaTest(boolean ... v) {
        System.out.print("���������� ����������: " + v.length + " ����������: ");
        for(boolean x: v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

        public static void main(String[] args) {
            vaTest(10);
            vaTest(1,2,3);
            // vaTest(); ��������������� �� �� ���������� ������
        }
}
