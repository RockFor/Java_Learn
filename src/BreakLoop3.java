/**
 * Created by ����� on 11.12.2015.
 */
// break - ���������� ����� �� ������ ����������� �����
public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("������ " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if(j == 10) break; // ����� �� ���������� �����
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("����� ���������!");
    }
}
